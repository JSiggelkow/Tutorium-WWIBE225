# Aufgabe 2
Erstelle die Klassen Rider (5 Punkte) und Reitstall (15 Punkte) anhand des abgebildeten Klassendiagramms.

<img width="2951" height="1768" alt="mermaid-diagram-2026-09-01-223639" src="https://github.com/user-attachments/assets/0a0791d8-0681-4de8-8f1f-9782dec4dbea" />

## Hinweise zur Klasse Rider
Die Methode ```int compareTo(other: Terminator)``` soll so implementiert werden, dass Terminatoren absteigend
nach ihrem Gewicht sortiert werden können (2,5 Punkte).

## Hinweise zur Klasse Reistall
* Die Schlüssel-Werte-Paare des Assoziativspeichers data beinhalten als Schlüssel die Reiter sowie als Wert das dazugehörige Pferd.
* Die Methode ```Optional<Horse> getHorseByRider(rider: Rider)``` soll das Pferd zur eingehenden Seriennummer zurückgeben. (2,5 Punkte)
* Die Methode ```List<Horse> getHorsesByType(type: Type)``` soll alle Pferde zum eingehenden Type zurückgeben. (2,5 Punkte)
* Die Methode ```double getAverageRating() throws Exception``` soll das durchschnittliche Rating aller Reiter des Reitstalls zurückgeben. (4,5 Punkte)   
Für den Fall, dass kein durchschnittliches Rating berechnet werden kann (leere Liste), soll die Ausnahme Exception ausgelöst werden.
* Die Methode ```Map<Type, List<Horse>> getHorsesGroupedByType()``` soll alle Pferde gruppiert nach ihrem Type zurückgeben. (3 Punkte)
