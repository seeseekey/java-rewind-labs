# Lab: Collection Factory Methods

Version: Java 9
Feature-Fokus: `List.of`, `Set.of`, `Map.of`

## Ziel

Du ersetzt manuell befüllte Collections durch kompakte Factory Methods.

## Ausgangslage

`before/` erzeugt eine mutable Liste und befüllt sie schrittweise. `after/` nutzt `List.of`.

## Aufgabe

Formuliere die Collection-Erzeugung kompakt und prüfe, was bei nachträglicher Mutation passiert.

## Hinweise

* Factory Collections sind unveränderlich.
* Historischer Hinweis: Java 9 brachte mehrere kleine Komfort-APIs für Alltagscode.

## Kompilieren

```bash
javac -d .lab-build/java-09-collection-factories-before $(find java-09-collection-factories/before -name '*.java')
javac -d .lab-build/java-09-collection-factories-after $(find java-09-collection-factories/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-09-collection-factories-before Main
java -cp .lab-build/java-09-collection-factories-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `[Ada, Grace]` aus. Die `after`-Variante meldet, dass Mutation blockiert wurde.

## Diskussion

Kläre, wann Unveränderlichkeit ein Vorteil und wann eine mutable Collection nötig ist.
