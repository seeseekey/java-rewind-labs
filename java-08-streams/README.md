# Lab: Streams statt Schleifen

Version: Java 8
Feature-Fokus: Lambdas und Streams

## Ziel

Du zerlegst imperativen Collection-Code in Filtern, Transformieren und Sammeln.

## Ausgangslage

`before/` mischt alle Schritte in einer Schleife. `after/` formuliert dieselbe Verarbeitung als Stream-Pipeline.

## Aufgabe

Übersetze die Schleife in eine Pipeline und benenne, welche Seiteneffekte in Streams problematisch wären.

## Hinweise

* Gute Streams lesen sich wie eine Datenflussbeschreibung.
* Historischer Hinweis: Java 8 veränderte den Java-Stil stärker als die meisten Releases davor.

## Kompilieren

```bash
javac -d .lab-build/java-08-before $(find java-08-streams/before -name '*.java')
javac -d .lab-build/java-08-after $(find java-08-streams/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-08-before Main
java -cp .lab-build/java-08-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `[ADA, GRACE]` aus.

## Diskussion

Kläre, wann eine Stream-Pipeline lesbarer ist und wann eine Schleife ehrlicher bleibt.
