# Lab: Switch als Ausdruck

Version: Java 12
Feature-Fokus: Switch Expressions und Preview-Prozess

## Ziel

Du wandelst ein altes `switch` mit Zuweisung und `break` in einen Ausdruck um.

## Ausgangslage

`before/` verwendet ein klassisches Statement. `after/` nutzt die heutige finale Syntax für Switch Expressions.

## Aufgabe

Formuliere `label` als Ausdruck und erkläre, welche Fall-through-Fehler dadurch verschwinden.

## Hinweise

* Die moderne Syntax ist hier bewusst mit aktuellem JDK ausführbar.
* Historischer Hinweis: In Java 12 war Switch Expression noch Preview; final wurde das Feature später.

## Kompilieren

```bash
javac -d .lab-build/java-12-before $(find java-12-switch-preview/before -name '*.java')
javac -d .lab-build/java-12-after $(find java-12-switch-preview/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-12-before Main
java -cp .lab-build/java-12-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `offen` aus.

## Diskussion

Kläre, warum Preview-Features Feedback ermöglichen, aber nicht unkritisch in Produktivcode gehören.

