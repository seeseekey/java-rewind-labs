# Lab: Kompakter Einstieg

Version: Java 25
Feature-Fokus: Compact Source Files

## Ziel

Du startest ein kompaktes Java-Programm und erkennst, welche Einstiegshürden für kleine Programme verschwinden.

## Ausgangslage

`before/` zeigt klassische Klasse mit `public static void main`. `after/` nutzt eine kompakte Quelldatei mit `void main()` und `IO.println`.

## Aufgabe

Vergleiche beide Startformen und diskutiere, für welche Programme kompakte Quelldateien gedacht sind.

## Hinweise

* Compact Source Files sind für Einstieg, Skripte und kleine Programme gedacht.
* Historischer Hinweis: Java 25 ist hier der moderne LTS-Anker für kompakteren Einstieg und finalisierte Kontext-APIs.

## Kompilieren

```bash
javac -d .lab-build/java-25-before java-25-compact-source/before/Main.java
javac -d .lab-build/java-25-after java-25-compact-source/after/Hello.java
```

## Ausführen

```bash
java -cp .lab-build/java-25-before Main
java -cp .lab-build/java-25-after Hello
```

## Erwartete Ausgabe

`before/` gibt `Hallo klassisches Java` aus. `after/` gibt `Hallo Java 25` aus.

## Diskussion

Diskutiere, warum Einstiegscode kürzer werden darf, ohne den professionellen Java-Stil für grosse Systeme zu ersetzen.
