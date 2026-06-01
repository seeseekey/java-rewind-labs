# Lab: Assertions, NIO und Regex

Version: Java 4
Feature-Fokus: `assert`, NIO-Buffer/Charset und reguläre Ausdrücke

## Ziel

Du ersetzt manuelles Parsen durch NIO-Textdekodierung und eine Regex, und grenzt Assertions von Eingabevalidierung ab.

## Ausgangslage

`before/` liest einen Benutzernamen aus einer Textnachricht und validiert ihn mit Indexsuche, Schleifen und Zeichenprüfungen. `after/` löst dieselbe Aufgabe mit einem `ByteBuffer`, expliziter UTF-8-Dekodierung über `Charset` und einem `Pattern`.

## Aufgabe

Überführe die manuelle Prüfung aus `before/` in die kompaktere Variante aus `after/`. Aktiviere Assertions mit `-ea` und erkläre, warum das Lab ungültige Eingaben weiterhin mit Exceptions behandelt, Assertions aber nur interne Annahmen absichern.

## Hinweise

* Assertions sind standardmäßig deaktiviert.
* Die Regex ist die fachliche Validierungsregel; die Assertion prüft nur, was nach erfolgreicher Regex ohnehin gelten muss.
* NIO steht hier bewusst für Java-1.4-NIO mit `ByteBuffer` und `Charset`, nicht für das spätere NIO.2-`Files`-API aus Java 7.
* Historischer Hinweis: Java 1.4 brachte mehrere Alltagshilfen gleichzeitig: `assert`, Regex, NIO, Logging und XML-APIs.

## Kompilieren

```bash
javac -d .lab-build/java-04-before $(find java-04-assert-nio-regex/before -name '*.java')
javac -d .lab-build/java-04-after $(find java-04-assert-nio-regex/after -name '*.java')
```

## Ausführen

```bash
java -ea -cp .lab-build/java-04-before Main
java -ea -cp .lab-build/java-04-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `ok: ada_01` aus.

## Diskussion

Vergleiche, welche Regeln im manuellen Code leicht übersehen werden können und welche Teile durch Regex und explizite Textdekodierung klarer werden. Grenze interne Plausibilitätschecks gegen fachliche Validierung ab.
