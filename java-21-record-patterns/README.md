# Lab: Record Patterns

Version: Java 21
Feature-Fokus: Record Patterns

## Ziel

Du dekonstruierst verschachtelte Records direkt im Pattern Matching.

## Ausgangslage

`before/` greift über Accessor-Ketten auf Record-Komponenten zu. `after/` nutzt ein Record Pattern.

## Aufgabe

Ersetze die Accessor-Kette durch ein Pattern, das `Order` und `Customer` in einem Schritt zerlegt.

## Hinweise

* Record Patterns passen besonders gut zu kleinen Value-Modellen.
* Historischer Hinweis: Record Patterns wurden in Java 21 final.

## Kompilieren

```bash
javac -d .lab-build/java-21-record-patterns-before $(find java-21-record-patterns/before -name '*.java')
javac -d .lab-build/java-21-record-patterns-after $(find java-21-record-patterns/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-21-record-patterns-before Main
java -cp .lab-build/java-21-record-patterns-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `Ada: 42.0` aus.

## Diskussion

Kläre, wann Dekonstruktion Absicht zeigt und wann Accessoren einfacher bleiben.
