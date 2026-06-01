# Lab: var bewusst einsetzen

Version: Java 10
Feature-Fokus: Local Variable Type Inference

## Ziel

Du setzt `var` dort ein, wo der Typ aus dem rechten Ausdruck klar bleibt.

## Ausgangslage

`before/` wiederholt einen langen generischen Typ. `after/` ersetzt nur die lokale Variable durch `var`.

## Aufgabe

Ersetze redundante lokale Typen durch `var` und begründe, welche Typen explizit bleiben sollten.

## Hinweise

* `var` ist keine dynamische Typisierung.
* Historischer Hinweis: Java 10 war Teil des neuen halbjährlichen Release-Rhythmus.

## Kompilieren

```bash
javac -d .lab-build/java-10-before $(find java-10-var/before -name '*.java')
javac -d .lab-build/java-10-after $(find java-10-var/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-10-before Main
java -cp .lab-build/java-10-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `{team=[1, 2, 3]}` aus.

## Diskussion

Kläre, ob `var` im Beispiel Lesbarkeit erhöht oder Typinformation versteckt.

