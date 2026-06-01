#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$ROOT_DIR"

if ! command -v javac >/dev/null 2>&1; then
    echo "ERROR: javac not found. Install JDK 25 or newer." >&2
    exit 1
fi

JAVA_VERSION="$(javac -version 2>&1 | awk '{print $2}')"
JAVA_MAJOR="${JAVA_VERSION%%.*}"
if [[ "$JAVA_MAJOR" == "1" ]]; then
    JAVA_MAJOR="$(echo "$JAVA_VERSION" | cut -d. -f2)"
fi

if (( JAVA_MAJOR < 25 )); then
    echo "ERROR: JDK 25 or newer required. Found javac $JAVA_VERSION." >&2
    exit 1
fi

WORK_DIR="$ROOT_DIR/.lab-build/verify"
rm -rf "$WORK_DIR"
mkdir -p "$WORK_DIR"

compile_side() {
    local lab="$1"
    local side="$2"
    local src_dir="$lab/$side"
    local out_dir="$WORK_DIR/$lab/$side"

    mkdir -p "$out_dir"
    echo "compile $lab/$side"
    find "$src_dir" -name '*.java' -print0 | xargs -0 javac -d "$out_dir"
}

run_class() {
    local lab="$1"
    local class_name="$2"
    local out_dir="$WORK_DIR/$lab/after"

    echo "smoke  $lab -> $class_name"
    java -cp "$out_dir" "$class_name" >/dev/null
}

run_module() {
    local lab="$1"
    local module="$2"
    local main_class="$3"
    local out_dir="$WORK_DIR/$lab/after"

    echo "smoke  $lab -> $module/$main_class"
    java --module-path "$out_dir" -m "$module/$main_class" >/dev/null
}

for lab_dir in java-*; do
    [[ -d "$lab_dir" ]] || continue
    compile_side "$lab_dir" before
    compile_side "$lab_dir" after
done

run_class java-01-inner-classes Main
run_class java-02-raw-collections Main
run_class java-03-runtime-observation Main
run_class java-04-assert-nio-regex Main
run_class java-05-annotations Main
run_class java-05-enums Main
run_class java-05-generics Main
run_class java-06-compiler-api Main
run_class java-07-nio2-files Main
run_class java-07-try-with-resources Main
run_class java-08-java-time Main
run_class java-08-optional Main
run_class java-08-streams Main
run_module java-09-modules workshop.core org.example.workshop.Main
run_class java-09-collection-factories Main
run_class java-10-var Main
echo "skip   java-11-http-client -> requires network"
run_class java-11-single-file-source Main
run_class java-12-switch-preview Main
run_class java-13-text-blocks-preview Main
run_class java-14-records-preview Main
run_class java-15-sealed-textblocks Main
run_class java-16-pattern-instanceof Main
run_class java-16-records-final Main
run_class java-17-pattern-switch Main
run_class java-19-virtual-threads-preview Main
run_class java-20-scoped-values Main
run_class java-21-record-patterns Main
run_class java-21-sequenced-collections Main
run_class java-21-virtual-threads Main
run_class java-22-ffm Main
run_class java-23-module-imports-docs Main
run_class java-24-stream-gatherers Main
run_class java-25-compact-source Hello

echo "All Java Rewind labs compile and smoke tests passed with javac $JAVA_VERSION."
