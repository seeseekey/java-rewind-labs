# Lab: Virtual Threads einordnen

Version: Java 19
Feature-Fokus: Virtual Threads Preview

## Ziel

Du vergleichst viele blockierende Tasks auf einem kleinen festen Pool mit Virtual Threads.

## Ausgangslage

`before/` nutzt einen `FixedThreadPool(4)`. `after/` startet dieselben schlafenden Tasks mit `newVirtualThreadPerTaskExecutor()`.

## Aufgabe

Führe beide Varianten aus und erkläre, warum Virtual Threads blockierende Arbeit besser skalieren, aber CPU-Arbeit nicht magisch beschleunigen.

## Hinweise

* Die gemessene Zeit ist eine Demo, kein Benchmark.
* Historischer Hinweis: Virtual Threads waren in Java 19 Preview und wurden in Java 21 final.

## Kompilieren

```bash
javac -d .lab-build/java-19-before $(find java-19-virtual-threads-preview/before -name '*.java')
javac -d .lab-build/java-19-after $(find java-19-virtual-threads-preview/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-19-before Main
java -cp .lab-build/java-19-after Main
```

## Erwartete Ausgabe

Beide Varianten geben eine `durationMs=...`-Zeile aus; die Virtual-Thread-Variante sollte bei den schlafenden Tasks deutlich kürzer sein.

## Diskussion

Diskutiere, dass echte Engpässe weiterhin begrenzt werden müssen: Datenbanken, APIs, Rate Limits und CPU.
