# Lab: Sequenced Collections

Version: Java 21
Feature-Fokus: Sequenced Collections

## Ziel

Du ersetzt Indexzugriffe auf Anfang und Ende durch Sequenced-Collection-APIs.

## Ausgangslage

`before/` nutzt `get(0)`, `get(size - 1)` und manuelle Umkehrung. `after/` nutzt `getFirst`, `getLast` und `reversed`.

## Aufgabe

Formuliere Anfang, Ende und umgekehrte Sicht ausdrücklich über die Collection-API.

## Hinweise

* Sequenced Collections machen Reihenfolge im Typmodell sichtbar.
* Historischer Hinweis: Java 21 vereinheitlichte APIs für geordnete Collections.

## Kompilieren

```bash
javac -d .lab-build/java-21-sequenced-collections-before $(find java-21-sequenced-collections/before -name '*.java')
javac -d .lab-build/java-21-sequenced-collections-after $(find java-21-sequenced-collections/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-21-sequenced-collections-before Main
java -cp .lab-build/java-21-sequenced-collections-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `erst=Ada, letztes=Grace` und `[Grace, Bob, Ada]` aus.

## Diskussion

Diskutiere, warum explizite Reihenfolge APIs lesbarer macht.
