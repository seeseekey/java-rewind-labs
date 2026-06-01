# Lab: Generics und Enhanced for

Version: Java 5
Feature-Fokus: Generics und Enhanced for

## Ziel

Du modernisierst alten Collection-Code mit Generics und ersetzt Iterator-Boilerplate durch Enhanced for.

## Ausgangslage

`before/` nutzt Raw Types und einen expliziten `Iterator`. `after/` nutzt `List<String>` und `for (String name : names)`.

## Aufgabe

Typisiere die Collection, entferne Casts und formuliere die Schleife elementorientiert.

## Hinweise

* Enhanced for eignet sich, wenn der Index nicht Teil der Aussage ist.
* Historischer Hinweis: Java 5 war ein grosser Sprachsprung; viele heutige Java-Konventionen starten hier.

## Kompilieren

```bash
javac -d .lab-build/java-05-before $(find java-05-generics/before -name '*.java')
javac -d .lab-build/java-05-after $(find java-05-generics/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-05-before Main
java -cp .lab-build/java-05-after Main
```

## Erwartete Ausgabe

`after/` gibt `Ada` und `Grace` aus.

## Diskussion

Diskutiere, warum Typsicherheit und Lesbarkeit hier zusammenhängen.
