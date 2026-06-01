# Lab: Datum und Zeit mit java.time

Version: Java 8
Feature-Fokus: `java.time`

## Ziel

Du ersetzt mutable Datums-APIs durch klare Typen aus `java.time`.

## Ausgangslage

`before/` nutzt `Calendar` und nullbasierte Monate. `after/` nutzt `LocalDate` und `Period`.

## Aufgabe

Berechne die Zeit bis zu einem Release-Datum mit `LocalDate` und erkläre, warum die API weniger fehleranfällig ist.

## Hinweise

* `LocalDate` ist unveränderlich.
* Historischer Hinweis: `java.time` basiert auf Ideen aus Joda-Time und wurde in Java 8 Teil der Standardbibliothek.

## Kompilieren

```bash
javac -d .lab-build/java-08-java-time-before $(find java-08-java-time/before -name '*.java')
javac -d .lab-build/java-08-java-time-after $(find java-08-java-time/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-08-java-time-before Main
java -cp .lab-build/java-08-java-time-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `30 Tage` aus.

## Diskussion

Kläre den Unterschied zwischen Datum, Zeitpunkt, Dauer und Zeitraum.
