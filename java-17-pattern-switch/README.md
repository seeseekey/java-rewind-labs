# Lab: Sealed plus switch

Version: Java 17
Feature-Fokus: Sealed Classes final und Pattern Matching Preview

## Ziel

Du verarbeitest eine geschlossene Hierarchie mit `switch` und erkennst Exhaustiveness.

## Ausgangslage

`before/` definiert eine sealed Hierarchie, verarbeitet sie aber noch nicht. `after/` nutzt Pattern Matching im `switch`.

## Aufgabe

Ergänze eine Methode, die alle erlaubten `Payment`-Typen behandelt, und prüfe, ob ein `default` nötig ist.

## Hinweise

* Die moderne Syntax ist mit aktuellem JDK ausführbar.
* Historischer Hinweis: Sealed Classes waren in Java 17 final; Pattern Matching for switch war damals noch Preview.

## Kompilieren

```bash
javac -d .lab-build/java-17-before $(find java-17-pattern-switch/before -name '*.java')
javac -d .lab-build/java-17-after $(find java-17-pattern-switch/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-17-before Main
java -cp .lab-build/java-17-after Main
```

## Erwartete Ausgabe

`after/` gibt `Karte` aus.

## Diskussion

Diskutiere, warum geschlossene Hierarchien und Pattern Matching zusammenpassen.

