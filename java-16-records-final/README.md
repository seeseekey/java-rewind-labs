# Lab: Records produktiv nutzen

Version: Java 16
Feature-Fokus: Records final

## Ziel

Du erweiterst einen Record um Validierung und erkennst, dass Records mehr als reine Datencontainer sein können.

## Ausgangslage

`before/` erlaubt einen leeren Namen. `after/` validiert im kompakten Konstruktor.

## Aufgabe

Füge die Validierung hinzu und teste, was bei leerem oder `null`-Namen passieren soll.

## Hinweise

* Der kompakte Konstruktor validiert die kanonischen Komponenten.
* Historischer Hinweis: Records wurden in Java 16 final und sind seitdem produktiv nutzbar.

## Kompilieren

```bash
javac -d .lab-build/java-16-before $(find java-16-records-final/before -name '*.java')
javac -d .lab-build/java-16-after $(find java-16-records-final/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-16-before Main
java -cp .lab-build/java-16-after Main
```

## Erwartete Ausgabe

`after/` gibt `User[name=Ada]` aus. Bei leerem Namen würde der Konstruktor eine `IllegalArgumentException` werfen.

## Diskussion

Kläre, warum Records gut für Werte sind, aber nicht jede Klasse ersetzen.
