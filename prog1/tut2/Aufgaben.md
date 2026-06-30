# Tutorium 26.02. – Objektorientierte Programmierung

---

## Aufgabe 1 – Studierendenverwaltung

Die DHBW möchte ihre Studenten verwalten. Gegeben ist dazu folgendes Klassendiagramm:

<img src="img_1.png" width="200">

**a)** Implementiere die Klasse `Student` anhand des Klassendiagramms.  
`printInfo()` soll folgende Ausgabe erzeugen:

```
Gregory Peck (1234567)
```

**b)** Erstelle die `Main`-Klasse mit `main`-Methode. Die Methode soll zwei `Student`-Objekte erstellen und sie einer `ArrayList` hinzufügen. <br>Gib anschließend mit einer Schleife alle Studierenden aus.

---

## Aufgabe 2 – Towerstars Ravensburg

Die Towerstars Ravensburg möchten ihre Spieler und deren Tore verwalten.

Gegeben ist folgendes Klassendiagramm:

<img src="img_4.png" height="300">

Die Methode `scoreGoal()` soll `goals` um 1 erhöhen.
Der Konstruktor `Team` soll die Liste `players` initialisieren.<br>
Die Methode `addPlayer(Player p)` soll den Spieler der Liste hinzufügen.
Die Methode`printTopScorer()` soll den Spieler mit den meisten Toren ausgeben.

**a)** Implementiere beide Klassen.

**b)** Erstelle in der `main`-Methode ein `Team`-Objekt mit dem Namen `"Towerstars"`, füge drei Spieler hinzu, lasse einen Spieler zweimal und einen anderen einmal ein Tor schießen und gib den Topscorer aus.


## Aufgabe 3 – Formel 1

Am 8. März 2026 startet die neue Formel 1 Saison in Australien.  
Mit Beginn der Saison tritt ein neues Motoren-Regelwerk in Kraft.

Die Teams sind nervös und möchten wissen, wie ihre Performance im ersten Rennen voraussichtlich aussehen wird.

Der Team Principal von McLaren hat dich beauftragt, eine Simulation des Rennen zu programmieren.  
Ziel ist es, zu analysieren, wie sich McLaren gegen seine stärksten Konkurrenten (Red Bull, Ferrari, Mercedes) der letzten Jahre schlägt.


Erstelle hierfür folgende Klasse:

<img src="img_5.png" height="300">

In der Methode ``calculatePowerForRace()``-Methode soll die gesamte Motor-Power für ein Rennen berechnet werden.  
Die Berechnung erfolgt nach folgenden Regeln:

1. Für jede Runde wird die HP zur Gesamtleistung addiert
2. Für jede Runde wird die aktuelle Battery zu Gesamtleistung addiert
3. Nach jeder Runde wird die Battery um 1 reduziert, solange sie noch größer als 0 ist
4. Die Methode gibt am Ende die Gesamtleistung zurück

Erstelle eine ``Main``-Klasse.  
In der main-Methode sollen folgende Rennautos initialisiert werden:
1. McLaren, HP = 405, Battery = 85
2. Ferrari, HP = 415, Battery = 70
3. RedBull, HP = 410, Battery = 75
4. Mercedes, HP = 395, Battery = 95

Der Australien Grand Prix hat 58 Runden. Lasse alle vier Autos das Rennen fahren.  
Berechne die Gesamtleistung jedes Autos und gib anschließend den Gewinner in folgender Form aus:

```McLaren wins with 26767 power.```

