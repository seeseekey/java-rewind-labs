# Lab: Defaults sichtbar machen

Version: Java 18
Feature-Fokus: UTF-8 by Default

## Ziel

Du prüfst den Default Charset und machst sichtbar, dass moderne Java-Versionen UTF-8 als einheitlichen Default nutzen.

## Ausgangslage

`before/` gibt nur den Charset aus. `after/` benennt die Ausgabe als Default Charset.

## Aufgabe

Starte das Programm und vergleiche die Ausgabe beider Varianten.

## Hinweise

* Historischer Hinweis: Java 18 vereinheitlichte den Default Charset auf UTF-8.

## Kompilieren

```bash
javac -d .lab-build/java-18-before $(find java-18-utf8-webserver/before -name '*.java')
javac -d .lab-build/java-18-after $(find java-18-utf8-webserver/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-18-before Main
java -cp .lab-build/java-18-after Main
```

## Erwartete Ausgabe

Die Java-Programme geben `UTF-8` aus; `after/` macht zusätzlich klar, dass es der Default Charset ist.

## Diskussion

Kläre, warum bessere Defaults Migrationen erleichtern, aber bestehende Daten trotzdem geprüft werden müssen.
