# Lab: Geschlossene Hierarchie skizzieren

Version: Java 15
Feature-Fokus: Sealed Classes

## Ziel

Du modellierst eine kleine Typhierarchie als geschlossen und erkennst, warum das später Pattern Matching erleichtert.

## Ausgangslage

`before/` lässt beliebige `Shape`-Implementierungen zu. `after/` begrenzt dieselbe Hierarchie mit `sealed` und `permits`.

## Aufgabe

Entferne den zusätzlichen `Triangle`-Typ und definiere die erlaubten Untertypen explizit.

## Hinweise

* Eine geschlossene Hierarchie ist ein fachlicher Vertrag.
* Historischer Hinweis: Sealed Classes waren in Java 15 Preview und wurden in Java 17 final.

## Kompilieren

```bash
javac -d .lab-build/java-15-before $(find java-15-sealed-textblocks/before -name '*.java')
javac -d .lab-build/java-15-after $(find java-15-sealed-textblocks/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-15-before Main
java -cp .lab-build/java-15-after Main
```

## Erwartete Ausgabe

`before/` zeigt einen `Triangle`. `after/` zeigt einen erlaubten `Circle`.

## Diskussion

Diskutiere, wann Erweiterbarkeit gewünscht ist und wann sie ein Modell unschärfer macht.
