# Lab: Annotationen auslesen

Version: Java 5
Feature-Fokus: Annotations und Reflection

## Ziel

Du definierst eine einfache Annotation und liest sie zur Laufzeit aus.

## Ausgangslage

`before/` beschreibt Metadaten als String-Konvention. `after/` nutzt eine Annotation mit `@Retention(RUNTIME)`.

## Aufgabe

Ersetze die String-Konvention durch eine Annotation und lies den Wert per Reflection aus.

## Hinweise

* Ohne `@Retention(RetentionPolicy.RUNTIME)` ist die Annotation zur Laufzeit nicht sichtbar.
* Historischer Hinweis: Annotations sind eine Grundlage für Frameworks wie JUnit, JPA und Spring.

## Kompilieren

```bash
javac -d .lab-build/java-05-annotations-before $(find java-05-annotations/before -name '*.java')
javac -d .lab-build/java-05-annotations-after $(find java-05-annotations/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-05-annotations-before Main
java -cp .lab-build/java-05-annotations-after Main
```

## Erwartete Ausgabe

Beide Varianten geben `users` aus.

## Diskussion

Kläre, warum Metadaten im Code besser als Kommentare oder Namenskonventionen prüfbar sind.
