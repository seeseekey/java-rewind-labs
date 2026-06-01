# Lab: Nativer Speicher ohne Unsafe

Version: Java 22
Feature-Fokus: Foreign Function & Memory API

## Ziel

Du vergleichst direkten Speicher über `ByteBuffer` mit der klar gescopten FFM-API.

## Ausgangslage

`before/` nutzt einen direkten `ByteBuffer`. `after/` reserviert nativen Speicher in einer `Arena`.

## Aufgabe

Lege einen Integer in nativen Speicher und erkläre, wie `Arena` den Lebenszyklus sichtbar begrenzt.

## Hinweise

* `Arena.ofConfined()` schließt den Speicher am Ende des try-with-resources-Blocks.
* Historischer Hinweis: Die FFM-API wurde in Java 22 final und ersetzt viele `Unsafe`-/JNI-Sonderwege.

## Kompilieren

```bash
javac -d .lab-build/java-22-before $(find java-22-ffm/before -name '*.java')
javac -d .lab-build/java-22-after $(find java-22-ffm/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-22-before Main
java -cp .lab-build/java-22-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `42` aus; `before/` gibt zusätzlich einen Hinweis auf den fehlenden Scope aus.

## Diskussion

Kläre, warum explizite Lebensdauer bei nativem Speicher wichtiger ist als syntaktischer Komfort.
