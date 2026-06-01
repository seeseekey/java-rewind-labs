# Lab: Optional statt null

Version: Java 8
Feature-Fokus: Optional

## Ziel

Du ersetzt eine `null`-Rückgabe durch `Optional`.

## Ausgangslage

`before/` kann `null` liefern. `after/` macht das mögliche Fehlen im Rückgabetyp sichtbar.

## Aufgabe

Formuliere `findEmail` mit `Optional<String>` und behandle den fehlenden Wert ohne Null-Check.

## Hinweise

* `Optional` ist besonders für Rückgabewerte geeignet.
* Historischer Hinweis: Java 8 brachte `Optional` als Standardmuster für ausdrücklich mögliches Fehlen.

## Kompilieren

```bash
javac -d .lab-build/java-08-optional-before $(find java-08-optional/before -name '*.java')
javac -d .lab-build/java-08-optional-after $(find java-08-optional/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-08-optional-before Main
java -cp .lab-build/java-08-optional-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `keine E-Mail` aus.

## Diskussion

Diskutiere, wann `Optional` lesbarer ist und warum es nicht jedes `null` im Code ersetzt.
