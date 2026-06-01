# Lab: Runtime beobachten

Version: Java 3
Feature-Fokus: HotSpot und Runtime-Performance

## Ziel

Du erkennst, dass Java-Performance nicht nur Quellcode ist, sondern stark von JVM, JIT und Startbedingungen abhängt.

## Ausgangslage

`before/` berechnet nur eine Summe. `after/` misst zusätzlich die Laufzeit.

## Aufgabe

Kompiliere beide Varianten und starte `after/` mehrfach. Vergleiche die Laufzeiten.

## Hinweise

* Kleine Benchmarks sind ungenau; hier geht es um Beobachtung, nicht um belastbares Benchmarking.
* Historischer Hinweis: HotSpot machte Java für Server-Workloads deutlich attraktiver.

## Kompilieren

```bash
javac -d .lab-build/java-03-before $(find java-03-runtime-observation/before -name '*.java')
javac -d .lab-build/java-03-after $(find java-03-runtime-observation/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-03-before Main
java -cp .lab-build/java-03-after Main
java -cp .lab-build/java-03-after Main
```

## Erwartete Ausgabe

`before/` gibt eine Summe aus. `after/` gibt `sum=...` und `durationMs=...` aus.

## Diskussion

Diskutiere Warmup, JIT-Optimierung und warum echte Benchmarks Werkzeuge wie JMH brauchen.

