# Lab: Java als Tooling-Plattform

Version: Java 6
Feature-Fokus: Compiler API und Tooling

## Ziel

Du verstehst, warum eine standardisierte Compiler-API für IDEs, Generatoren und Frameworks nützlich ist.

## Ausgangslage

`before/` hat Quelltext nur als String und verweist auf externe Kompilierung. `after/` kompiliert eine erzeugte Datei über `javax.tools.JavaCompiler`.

## Aufgabe

Lies den erzeugten Quelltext, starte die Compiler-API-Variante und erkläre, welche Werkzeuge davon profitieren.

## Hinweise

* Das Beispiel braucht ein JDK, kein minimales Runtime-Image ohne Compiler.
* Historischer Hinweis: Java 6 stärkte Java als Plattform für Werkzeuge, nicht nur als Sprache für Anwendungen.

## Kompilieren

```bash
javac -d .lab-build/java-06-before $(find java-06-compiler-api/before -name '*.java')
javac -d .lab-build/java-06-after $(find java-06-compiler-api/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-06-before Main
java -cp .lab-build/java-06-after Main
```

## Erwartete Ausgabe

`after/` meldet `Compiler API Exit-Code: 0` und `Class-Datei erzeugt: true`.

## Diskussion

Ordne ein, warum Annotation Processing, IDEs und Build-Tools eine stabile Compiler-Schnittstelle brauchen.

