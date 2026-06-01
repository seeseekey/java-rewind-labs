# Lab: Dokumentation und Imports vereinfachen

Version: Java 23
Feature-Fokus: Markdown Documentation Comments und Module Imports Preview

## Ziel

Du schreibst Markdown-Javadoc und siehst, wie `import module` Explorationscode kürzer machen kann.

## Ausgangslage

`before/` nutzt klassischen HTML-Javadoc. `after/` nutzt Markdown-Kommentare und `import module java.base`.

## Aufgabe

Ersetze den Kommentar durch Markdown-Javadoc und verwende Typen aus `java.base`, ohne einzelne Packages zu importieren.

## Hinweise

* Module Imports sollen Lern- und Explorationscode vereinfachen, nicht jeden Import in Produktionscode ersetzen.
* Historischer Hinweis: Module Imports waren in Java 23 Preview und wurden auf dem Weg zu Java 25 weiterentwickelt.

## Kompilieren

```bash
javac -d .lab-build/java-23-before $(find java-23-module-imports-docs/before -name '*.java')
javac -d .lab-build/java-23-after $(find java-23-module-imports-docs/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-23-before Main
java -cp .lab-build/java-23-after Main
```

## Erwartete Ausgabe

`after/` gibt `Hallo Ada` und `Hallo Grace` aus.

## Diskussion

Diskutiere, wann breite Sichtbarkeit durch Module Imports hilfreich ist und wann gezielte Imports lesbarer bleiben.

