# Lab: Pattern Matching for instanceof

Version: Java 16
Feature-Fokus: Pattern Matching for `instanceof`

## Ziel

Du ersetzt `instanceof` plus Cast durch eine Pattern Variable.

## Ausgangslage

`before/` prüft den Typ und castet danach manuell. `after/` bindet die Variable direkt in der `instanceof`-Prüfung.

## Aufgabe

Vereinfache die Typprüfung und entferne den expliziten Cast.

## Hinweise

* Die Pattern Variable ist nur im passenden Kontrollfluss sichtbar.
* Historischer Hinweis: Pattern Matching for `instanceof` wurde in Java 16 final.

## Kompilieren

```bash
javac -d .lab-build/java-16-pattern-instanceof-before $(find java-16-pattern-instanceof/before -name '*.java')
javac -d .lab-build/java-16-pattern-instanceof-after $(find java-16-pattern-instanceof/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-16-pattern-instanceof-before Main
java -cp .lab-build/java-16-pattern-instanceof-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `ADA` aus.

## Diskussion

Kläre, warum der Compiler die Sichtbarkeit der Pattern Variable begrenzen muss.
