# Java Rewind Labs

Begleitende Übungen zum Java Rewind Talk.

Dieses Verzeichnis kann als eigenes Lab-Repository genutzt werden. Jedes Lab ist eigenständig aufgebaut:

* `before/`: Ausgangscode der Übung
* `after/`: ein möglicher Lösungsvorschlag
* `README.md`: Aufgabe, Hinweise, Befehle und erwartete Ausgabe

## Voraussetzungen

Empfohlen ist JDK 25 oder neuer. Die Beispiele sind auf aktuelle Java-Versionen ausgelegt und erklären historische Preview- oder Incubator-Stände in den jeweiligen Lab-READMEs.

## Alle Labs prüfen

```bash
bash verify-labs.sh
```

Das Skript kompiliert alle `before/`- und `after/`-Varianten in `.lab-build/` und führt Smoke-Tests für die sinnvoll ausführbaren Lösungen aus.

## Einzelnes Lab bearbeiten

1. In das Lab wechseln, z. B. `java-08-streams`.
2. `README.md` lesen.
3. Code in `before/` bearbeiten.
4. Mit `after/` vergleichen.

Die Labs nutzen bewusst kein Maven oder Gradle, damit der Sprach- und API-Fokus sichtbar bleibt.
