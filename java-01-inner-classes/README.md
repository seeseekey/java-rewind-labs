# Lab: Callbacks vor Lambdas

Version: Java 1
Feature-Fokus: Inner Classes und AWT-Callbacks

## Ziel

Du erkennst, warum anonyme innere Klassen Callback-Code kompakter machen und warum Lambdas in Java 8 später so willkommen waren.

## Ausgangslage

`before/` nutzt eine benannte Listener-Klasse. `after/` ersetzt sie durch eine anonyme innere Klasse.

## Aufgabe

Ersetze `ClickListener` durch eine anonyme innere Klasse und benenne, welche Boilerplate trotzdem bleibt.

## Hinweise

* Achte darauf, dass `ActionListener` der Zieltyp bleibt.
* Historischer Hinweis: Vor Java 8 waren anonyme innere Klassen der übliche Weg für kurze Callback-Implementierungen.

## Kompilieren

```bash
javac -d .lab-build/java-01-before $(find java-01-inner-classes/before -name '*.java')
javac -d .lab-build/java-01-after $(find java-01-inner-classes/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-01-before Main
java -cp .lab-build/java-01-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `geklickt` aus.

## Diskussion

Diskutiere, warum die anonyme Klasse weniger Namen, aber noch viel Struktur erzwingt.

