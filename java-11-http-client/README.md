# Lab: Standard HTTP Client

Version: Java 11
Feature-Fokus: HTTP Client

## Ziel

Du ersetzt den alten `HttpURLConnection`-Stil durch den standardisierten HTTP Client.

## Ausgangslage

`before/` sendet einen einfachen Request mit `HttpURLConnection`. `after/` sendet denselben Request mit `HttpClient`.

## Aufgabe

Baue den Request mit `HttpClient` nach und vergleiche Aufbau, Lesbarkeit und Fehlerbehandlung mit `HttpURLConnection`.

## Hinweise

* Das Ausführen beider Varianten braucht Netzwerkzugriff.
* Historischer Hinweis: Der HTTP Client wurde in Java 11 standardisiert.

## Kompilieren

```bash
javac -d .lab-build/java-11-before $(find java-11-http-client/before -name '*.java')
javac -d .lab-build/java-11-after $(find java-11-http-client/after -name '*.java')
```

## Ausführen

```bash
java -cp .lab-build/java-11-before Main
java -cp .lab-build/java-11-after Main
```

## Erwartete Ausgabe

Beide Varianten geben bei erreichbarem Netzwerk einen HTTP-Statuscode aus, typischerweise `200`.

## Diskussion

Diskutiere, wann ein Standardclient reicht und wann Framework- oder Resilience-Bibliotheken nötig bleiben.
