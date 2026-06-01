# Lab: Ein Modul schneiden

Version: Java 9
Feature-Fokus: JPMS

## Ziel

Du schneidest ein Modul so, dass nur das API-Paket exportiert wird und interne Klassen kein Vertrag sind.

## Ausgangslage

`before/` läuft auf dem Classpath und kann interne Klassen direkt importieren. `after/` definiert `module workshop.core` und exportiert nur `org.example.workshop.api`.

## Aufgabe

Kompiliere beide Varianten, führe das Modul aus und erkläre, warum `internal` nicht exportiert wird.

## Hinweise

* `requires` beschreibt gelesene Module, `exports` den öffentlichen API-Vertrag.
* Historischer Hinweis: JPMS modularisierte nicht nur Anwendungen, sondern auch das JDK selbst.

## Kompilieren

```bash
javac -d .lab-build/java-09-before $(find java-09-modules/before -name '*.java')
javac -d .lab-build/java-09-after $(find java-09-modules/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-09-before Main
java --module-path .lab-build/java-09-after -m workshop.core/org.example.workshop.Main
```

## Erwartete Ausgabe

Die Modulvariante gibt `[Modul] Hallo Ada` aus und meldet, dass nur das API-Paket exportiert ist.

## Diskussion

Diskutiere, warum Module Grenzen sichtbarer machen als reine Package-Konventionen.
