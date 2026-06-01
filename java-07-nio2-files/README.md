# Lab: Dateien mit NIO.2

Version: Java 7
Feature-Fokus: NIO.2, `Path` und `Files`

## Ziel

Du ersetzt alten `File`-Code durch `Path` und `Files`.

## Ausgangslage

`before/` nutzt `File` und prüft Rückgabewerte. `after/` nutzt `Path`, `Files.createDirectories`, `Files.write` und `Files.readAllLines`.

## Aufgabe

Formuliere die Dateiarbeit mit NIO.2 und erkläre, warum Exceptions aussagekräftiger als boolesche Rückgaben sein können.

## Hinweise

* `Path` beschreibt Pfade abstrakter als `File`.
* Historischer Hinweis: NIO.2 modernisierte Dateisystemzugriffe in Java 7.

## Kompilieren

```bash
javac -d .lab-build/java-07-nio2-files-before $(find java-07-nio2-files/before -name '*.java')
javac -d .lab-build/java-07-nio2-files-after $(find java-07-nio2-files/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-07-nio2-files-before Main
java -cp .lab-build/java-07-nio2-files-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `Ada` aus.

## Diskussion

Diskutiere, warum moderne I/O-APIs Fehler besser sichtbar machen.
