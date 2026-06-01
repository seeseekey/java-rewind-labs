# Lab: Text Blocks ausprobieren

Version: Java 13
Feature-Fokus: Text Blocks und Preview-Reifung

## Ziel

Du ersetzt String-Verkettung durch einen Text Block und beobachtest Einrückung sowie Zeilenumbrüche.

## Ausgangslage

`before/` baut JSON mit `\n` und Verkettung. `after/` nutzt einen Text Block.

## Aufgabe

Formuliere den JSON-String als Text Block und vergleiche die Ausgabe.

## Hinweise

* Achte auf den abschließenden Zeilenumbruch des Text Blocks.
* Historischer Hinweis: Text Blocks waren in Java 13 Preview und wurden in Java 15 final.

## Kompilieren

```bash
javac -d .lab-build/java-13-before $(find java-13-text-blocks-preview/before -name '*.java')
javac -d .lab-build/java-13-after $(find java-13-text-blocks-preview/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-13-before Main
java -cp .lab-build/java-13-after Main
```

## Erwartete Ausgabe

Beide Varianten geben ein kleines JSON-Objekt mit `name` aus.

## Diskussion

Diskutiere, warum Text Blocks besonders für SQL, JSON und HTML in Tests hilfreich sind.

