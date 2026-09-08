# Aufgabe 1 (18 Punkte)
Erstelle die Klasse Player anhand des abgebildeten Klassendiagramms.  

<img width="872" height="516" alt="aufgabe1 drawio" src="https://github.com/user-attachments/assets/a0911b38-407d-442c-9f2d-af4f08e0946c" />

## Hinweise zur Klasse Player
* Die Schlüssel-Werte-Paare des Assoziativspeichers beinhalten als Schlüssel die ausgespielten Karten des Spielers sowie als Wert deren Reihe.
* Die Methode ```void playCard(card: Card, row: int)``` soll die eingehende Karte ausspielen.
Beim Ausspielen einer Karte wird diese aus den Handkarten entfernt und den ausgespielten Karten hinzugefügt.
Zudem werden die Aktionspunkte des Spielers um die Kosten der Karte reduziert.
Für den Fall, dass die Karte nicht Teil der Handkarten ist, soll die Ausnahme ```CardNotFoundException``` ausgelöst werden und für den Fall,
dass die Aktionspunkte des Spielers nicht ausreichen, die Ausnahme ```NotEnoughActionPointsException``` (8,5 Punkte)
* Die Methode ```Optional<Card> getMostPowerfulCardByRow(row: int)``` soll die stärkste ausgespielte Karte der eingehenden Reihe zurückgeben (7 Punkte)

# Aufgabe 2 (14 Punkte)
Erstelle die JUnit-5-Testklasse PlayerTest anhand des abgebildeten Klassendiagramms.  

<img width="872" height="766" alt="aufgabe2 drawio" src="https://github.com/user-attachments/assets/617a7f16-6fc7-4668-97be-65fdaf986ce5" />


## Hinweise zur Klasse PlayerTest
* Die Lebenszyklus-Methode ```void setUp()``` soll die Karte Zombie (Beschreibung: Zombie, Kosten: 3, Stärke: 4),
die Karte Vampir (Beschreibung: Vampir, Kosten: 6, Stärke: 7) sowie den Spieler Hans-Peter (Name: Hans-Peter) erstellen
und den entsprechenden Attributen zuweisen (2,5 Punkte)
* Die Testmethode ```void testPlayCard()``` soll dem Spieler die Karte Zombie als Handkarte hinzufügen, prüfen, ob beim Aufruf der Methode
```void playCard(row: int)``` mit der Karte Vampir sowie der Reihe 1 die Ausnahme ```CardNotFoundException``` ausgelöst wird und prüfen, ob beim Aufruf
der Methode ```void playCard(card: Card, row: int)``` mit der Karte Zombie sowie der Reihe 1 die Ausnahme ```NotEnoughActionPointsException``` ausgelöst wird (3,5 Punkte)
* Die Testmethode ```void testGetMostPowerfulCardByRow()``` soll dem Spieler 9 Aktionspunkte zuweisen, dem Spieler die beiden Karten Vampir und Zombie
als Handkarten hinzufügen, diese Karten in der Reihe 1 ausspielen, prüfen, ob beim Aufruf der Methode ```Optional<Card> getMostPowerfulCardByRow(row: int)```
mit dem Wert 1 die Karte Vampir als Optional zurückgegeben wird und prüfen, ob beim Aufruf der Methode ```Optional<Card> getMostPowerfulCardByRow(row: int)```
mit dem Wert 2 ein leeres Optional zurückgegeben wird (7 Punkte)

# Aufgabe 3 (20 Punkte)
Erstelle die Klasse CityQueries anhand des abgebildeten Klassendiagramms.  

<img width="472" height="716" alt="aufgabe3 drawio" src="https://github.com/user-attachments/assets/476675dc-256b-4f97-b080-c316c61e83b4" />


## Hinweise zur Klasse CityQueries
* Die Methode ```Map<Gender, List<Major>> getAllMajorsByGender()``` soll alle Bürgermeister gruppiert nach Geschlecht zurückgeben (3 Punkte)
* Die Methode ```List<String> getAllNamesFromCitiesInEuropeWithMoreThan1MioInhabitants()``` soll die Namen aller europäischen Städte mit mehr
als 1 Million Einwohner zurückgeben (4,5 Punkte)
* Die Methode ```Optional<String> getName0fMajorByName0fCity(name0fCity: String)``` soll den Namen des Bürgermeisters zum eingehenden Namen der Stadt zurückgeben (4 Punkte)
* Die Methode ```double getTotalAreaInKm20fAllCitiesWithFemaleMajors()``` soll die gesamte Fläche in km2 aller Städte mit weiblichen Bürgermeistern zurückgeben (3,5 Punkte)
* Die Methode ```void printCityWithMostPointsOfInterest()``` soll die Stadt mit den meisten Sehenswürdigkeiten in der Form: [Name der Stadt] ([Anzahl Sehenswürdigkeiten]) ausgeben (4 Punkte)


## Erweiterung Cheatsheet
<img width="762" height="612" alt="image" src="https://github.com/user-attachments/assets/494666d2-db10-4141-99eb-bedf742ded82" />

