# Lab: Streams erweitern

Version: Java 24
Feature-Fokus: Stream Gatherers

## Ziel

Du ersetzt manuelle Fensterbildung durch einen eingebauten Stream Gatherer.

## Ausgangslage

`before/` baut gleitende Fenster mit Indexschleife und `subList`. `after/` nutzt `Gatherers.windowSliding(3)`.

## Aufgabe

Formuliere die Fensterbildung als Stream-Pipeline und erkläre, wann das lesbarer als eigene Schleifen ist.

## Hinweise

* Gatherers erweitern Streams um Zwischenoperationen, die vorher schwer ausdrückbar waren.
* Historischer Hinweis: Stream Gatherers wurden in Java 24 final.

## Kompilieren

```bash
javac -d .lab-build/java-24-before $(find java-24-stream-gatherers/before -name '*.java')
javac -d .lab-build/java-24-after $(find java-24-stream-gatherers/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-24-before Main
java -cp .lab-build/java-24-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `[[1, 2, 3], [2, 3, 4], [3, 4, 5]]` aus.

## Diskussion

Kläre, ob die Pipeline die Absicht besser zeigt als die Indexarithmetik.
