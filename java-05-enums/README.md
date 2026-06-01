# Lab: Konstanten zu Enums

Version: Java 5
Feature-Fokus: Enums

## Ziel

Du ersetzt lose String-Konstanten durch einen typsicheren Enum.

## Ausgangslage

`before/` akzeptiert Statuswerte als String. `after/` nutzt `enum Status` und ein `switch`.

## Aufgabe

Modelliere die erlaubten Statuswerte als Enum und verhindere dadurch ungültige Werte schon beim Kompilieren.

## Hinweise

* Enums sind echte Typen und können Methoden oder Felder tragen.
* Historischer Hinweis: Java 5 machte Konstantengruppen typsicher und besser lesbar.

## Kompilieren

```bash
javac -d .lab-build/java-05-enums-before $(find java-05-enums/before -name '*.java')
javac -d .lab-build/java-05-enums-after $(find java-05-enums/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-05-enums-before Main
java -cp .lab-build/java-05-enums-after Main
```

## Erwartete Ausgabe

`before/` zeigt auch einen unbekannten Status. `after/` gibt `Offen` und `Erledigt` aus.

## Diskussion

Diskutiere, warum fachliche Zustandsräume nicht als freie Strings modelliert werden sollten.
