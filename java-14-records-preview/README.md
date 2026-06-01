# Lab: DTO zu Record

Version: Java 14
Feature-Fokus: Records Preview

## Ziel

Du ersetzt eine einfache Datenklasse durch einen Record und erkennst die automatisch erzeugten Methoden.

## Ausgangslage

`before/` enthält eine kleine unveränderliche Klasse. `after/` modelliert denselben Wert als `record`.

## Aufgabe

Ersetze Klasse, Konstruktor, Accessor und `toString` durch einen Record.

## Hinweise

* Records modellieren Daten, nicht beliebig veränderliche Objekte.
* Historischer Hinweis: Records waren in Java 14 Preview und wurden in Java 16 final.

## Kompilieren

```bash
javac -d .lab-build/java-14-before $(find java-14-records-preview/before -name '*.java')
javac -d .lab-build/java-14-after $(find java-14-records-preview/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-14-before Main
java -cp .lab-build/java-14-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `User[name=Ada]` aus.

## Diskussion

Kläre, welche Methoden Records generieren und wann eine normale Klasse passender bleibt.
