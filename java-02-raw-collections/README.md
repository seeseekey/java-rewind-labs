# Lab: Collections ohne Generics

Version: Java 2
Feature-Fokus: Collections Framework

## Ziel

Du siehst, wie Raw Types Laufzeitfehler erlauben, die Generics später schon beim Kompilieren verhindern.

## Ausgangslage

`before/` legt unterschiedliche Typen in eine rohe `List`. `after/` typisiert die Liste als `List<String>`.

## Aufgabe

Führe das Ausgangsbeispiel aus, finde den Fehler und modernisiere die Collection mit Generics.

## Hinweise

* Der Fehler steckt nicht in der Schleife, sondern in der untypisierten Collection.
* Historischer Hinweis: Das Collections Framework kam vor Generics; Typsicherheit wurde erst in Java 5 nachgerüstet.

## Kompilieren

```bash
javac -d .lab-build/java-02-before $(find java-02-raw-collections/before -name '*.java')
javac -d .lab-build/java-02-after $(find java-02-raw-collections/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-02-before Main
java -cp .lab-build/java-02-after Main
```

## Erwartete Ausgabe

`before/` endet mit `ClassCastException`. `after/` gibt `ADA` und `GRACE` aus.

## Diskussion

Kläre, warum Generics in Java Migration erleichtern mussten und deshalb mit Type Erasure umgesetzt wurden.

