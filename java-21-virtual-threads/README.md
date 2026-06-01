# Lab: Thread-per-request testen

Version: Java 21
Feature-Fokus: Virtual Threads final

## Ziel

Du führst viele blockierende Aufgaben mit Virtual Threads aus und grenzt sie gegen klassische Pools ab.

## Ausgangslage

`before/` nutzt einen festen Pool mit vier Plattform-Threads. `after/` nutzt pro Aufgabe einen Virtual Thread.

## Aufgabe

Vergleiche die gemessene Laufzeit und erkläre, wo normale Pools oder Semaphore weiterhin sinnvoll sind.

## Hinweise

* Virtual Threads sind für blockierende I/O-Muster gedacht.
* Historischer Hinweis: Virtual Threads wurden in Java 21 final und sind ein wichtiger LTS-Meilenstein.

## Kompilieren

```bash
javac -d .lab-build/java-21-before $(find java-21-virtual-threads/before -name '*.java')
javac -d .lab-build/java-21-after $(find java-21-virtual-threads/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-21-before Main
java -cp .lab-build/java-21-after Main
```

## Erwartete Ausgabe

Beide Varianten geben eine `durationMs=...`-Zeile aus; `after/` sollte bei den schlafenden Tasks schneller fertig sein.

## Diskussion

Diskutiere Thread-per-request neu: einfacher Code, aber weiterhin Grenzen an echten Ressourcen.
