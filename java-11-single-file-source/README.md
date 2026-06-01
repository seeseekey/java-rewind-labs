# Lab: Single-File Source starten

Version: Java 11
Feature-Fokus: Single-File Source-Code Programs

## Ziel

Du startest ein kleines Java-Programm direkt aus der Quelldatei.

## Ausgangslage

`before/` und `after/` enthalten bewusst denselben Quellcode. Das Lab vergleicht den klassischen Compile-Run-Ablauf mit dem direkten Start derselben Quelldatei.

## Aufgabe

Vergleiche `javac` plus `java -cp ...` mit `java java-11-single-file-source/after/Main.java`.

## Hinweise

* Single-File Source eignet sich für kleine Tools, Demos und Lerncode.
* Historischer Hinweis: Java 11 senkte die Einstiegshürde für kleine Programme.

## Kompilieren

```bash
javac -d .lab-build/java-11-single-file-source-before $(find java-11-single-file-source/before -name '*.java')
javac -d .lab-build/java-11-single-file-source-after $(find java-11-single-file-source/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-11-single-file-source-before Main
java java-11-single-file-source/after/Main.java
```

## Erwartete Ausgabe

Beide Varianten geben `Hallo Single File` aus.

## Diskussion

Diskutiere, warum Startkomfort für kleine Programme nicht dasselbe wie ein Build-System für Anwendungen ist.
