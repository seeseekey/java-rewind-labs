# Lab: Kontext ohne ThreadLocal

Version: Java 20
Feature-Fokus: Scoped Values Konzept

## Ziel

Du vergleichst frei setzbares `ThreadLocal` mit begrenzt gebundenem Kontext über `ScopedValue`.

## Ausgangslage

`before/` setzt und entfernt eine Request-ID manuell per `ThreadLocal`. `after/` bindet dieselbe Information für einen sichtbaren Scope.

## Aufgabe

Ersetze `ThreadLocal` durch `ScopedValue.where(...).run(...)` und erkläre, warum das bei Virtual Threads besser passt.

## Hinweise

* Scoped Values sind unveränderlicher, lexikalisch begrenzter Kontext.
* Historischer Hinweis: In Java 20 war das Thema Incubator/Preview; das Lab nutzt die heutige finale API.

## Kompilieren

```bash
javac -d .lab-build/java-20-before $(find java-20-scoped-values/before -name '*.java')
javac -d .lab-build/java-20-after $(find java-20-scoped-values/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-20-before Main
java -cp .lab-build/java-20-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `req-1` aus.

## Diskussion

Kläre, warum Scoped Values keine globalen Variablen sind und warum explizite Lebensdauer wichtig ist.

