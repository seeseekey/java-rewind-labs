# Lab: Ressourcen sicher schließen

Version: Java 7
Feature-Fokus: try-with-resources und NIO.2

## Ziel

Du vergleichst manuelles Schließen mit try-with-resources und erkennst, warum Ressourcenverwaltung dadurch robuster wird.

## Ausgangslage

`before/` schließt einen `BufferedReader` im `finally`. `after/` nutzt `Files.newBufferedReader` in try-with-resources.

## Aufgabe

Ersetze das manuelle Schließen und erkläre, wo suppressed exceptions auftreten können.

## Hinweise

* try-with-resources arbeitet mit `AutoCloseable`.
* Historischer Hinweis: Java 7 brachte kleine Sprachverbesserungen, die häufige Fehlerquellen reduzierten.

## Kompilieren

```bash
javac -d .lab-build/java-07-before $(find java-07-try-with-resources/before -name '*.java')
javac -d .lab-build/java-07-after $(find java-07-try-with-resources/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-07-before Main
java -cp .lab-build/java-07-after Main
```

## Erwartete Ausgabe

Beide Varianten geben die erste Zeile der Talk-README aus.

## Diskussion

Diskutiere, warum weniger Code hier nicht nur Komfort, sondern Fehlervermeidung ist.

