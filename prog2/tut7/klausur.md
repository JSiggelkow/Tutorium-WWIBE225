# Probeklausur Programmierung II
## Hinweise
* Pakete und Klassenimporte müssen nicht angegeben werden
* Die Klassen und Annotationen der Bibliotheken Lombok, JUnit5 und Mockito dürfen verwendet werden
* Es kann davon ausgegangen werden, dass sämtliche Klassen entsprechende Implementierungen der Object-Methoden besitzen
* So nicht anders angegeben sollen Konstruktionen, Setter, Getter sowie die Object Methoden wie in der Vorlesung gezeigt implementiert werden
* die Konsolensausgaben-Methoden der Klasse PrintStream dürfen sinnvoll gekürzt geschrieben z.B. ```sout```oder ```souf```
* Methoden- und Attributsbezeichner dürfen sinnvoll gekürzt geschrieben werden

## Wörterbuch
longitude = Längengrad

latitude = Breitengrad


    
# Aufgabe 1 (13 Punkte)
Erstelle die Klassen Tour und Strava anhand des abgebildeten Klassendiagramms.

<img width="1394" height="961" alt="aufgabe1 drawio-2" src="https://github.com/user-attachments/assets/5ff4454c-2e93-4037-9cbe-768814d608f9" />



## Hinweise zur Klasse Tour (8 Punkte)
* Die Methode ```int compareTo(o: Tour)``` soll so implementiert werden, dass Touren absteigend nach ihrer Länge sortiert werden können.
* Die Methode ```void addWayPoint(wayPoint: WayPoint)``` soll den eingehenden WayPoint der Liste an WayPoints hinzufügen. Wenn der Breitengrad kleiner als -90 oder größer als 90 ist, soll eine LatitudeException geworfen werden. Wenn der Längengrad kleiner als -180 oder größer als 180 ist, soll eine LongitudeException geworfen werden.

## Hinweise zur Klasse Strava (5 Punkte)
* Die Methode ```void showAllTours()``` soll alle Touren in der Konsole ausgeben. Hierbei ist auf die genaue Unterscheidung der Art der Tour zu achten. Bei allen Touren, egal welcher Art, soll der Name sowie die Länge der Tour ausgegeben werden. Bei Bike Touren soll das genutzt Bike mit ausgegeben werden und bei Running Touren soll der genutzte Schuh mit ausgegebe werden:
### Beispielhafter Konsolen-Output:
```bash
RUNNINGTOUR: Name: Coffee Run | Length: 10,00 km | Gear: RunningShoes[brand=Nike, price=123.0, isCarbon=false]
TOUR: Name: Roadtrip | Length: 100,00 km
BIKETOUR: Name: Tour de Bodensee | Length: 257,04 km | Gear: Bike[brand=Cube, biketype=GRAVEL, size=M, isCarbon=false, price=1400.0]
```

# Aufgabe 2 (10 Punkte)
Erstelle die JUnit-5-Testklasse StravaTest anhand des abgebildeten Klassendiagramms.  


<img width="1394" height="1011" alt="test-aufgabe drawio" src="https://github.com/user-attachments/assets/e5d0b342-45f6-4e6c-a75a-98c4d21abb36" />

## Hinweise zur Klasse StravaTest (10 Punkte)
* Die Lebenszyklus-Methode ```void setUp()```soll alle Klassen-Attribute sinnvoll initialisieren. Die Tour de Bodensee soll 257.04 km lang sein und der Coffee Run 10.00 km lang.
Die restlichen Werte können selbst sinnvoll gewählt werden. Die Methode soll weiter den CoffeeRun sowie die Tour de Bodensee zu der Touren-Liste des Strava-Objekts hinzufügen.
* Die Test-Methode ```void testComparingTour()``` soll die Touren-Liste von Strava sortieren und anschließend prüfen ob die erste Tour die Tour de Bodensee ist.
* Die Test-Methode ```void testLongitudeException```soll prüfen, ob eine ```LongitudeException```geworfen wird, wenn dem ```coffeeRun``` ein ```WayPoint```mit dem Breitengrad 50 und dem Längengrad 200
hinzugefügt wird.

# Aufgabe 3 (27 Punkte)
Erstelle die Klasse ``JobPortal`` anhand des abgebildeten Klassendiagramms.

## Klassendiagramm

<img width="3474" height="5630" alt="JobPortal Job Offer-2026-09-09-092018" src="https://github.com/user-attachments/assets/ae566cc8-e762-40a3-9023-53818216c111" />


## Hinweise zur Klasse ``JobPortal``
* Die Methode ``getJobsWith40WeeklyWorkHoursByCompany()`` soll die Jobs mit einer wöchentlichen Arbeitszeit von 40 Stunden nach den Unternehmen gruppieren.
* Die Methode ``getJobForJoa()`` soll alle Jobs zurückgeben, die den JobTitle ``Werkstudent`` haben und dessen Unternehmen im Norden liegen. Solltest du einen Job mit den Anforderungen kennen, freut sich Joa über eine Nachricht ;) 
* Die Methode ``getCompaniesWithAFemaleContactPerson()`` soll alle Unternehmen zurückgeben, die eine weibliche Kontaktperson angegeben haben.
* Die Methode ``getJobWithHighestSalaryBelow30WorkHours()`` soll den Job mit dem höchsten Gehalt zurückgeben, bei dem die Arbeitszeit unter 30 Stunden beträgt.
* Die Methode ``getAllContactPersonNamesSortedFromCompaniesLocatedInSouth()`` soll alle Namen der Kontaktpersonen von Unternehmen im Süden, ohne Dopplungen absteigend sortiert zurückgeben.
* Die Methode ``getJobsFromEastWithHourlyRateAbove20ByCompany()`` soll die Jobs aus East mit einem Stundenlohn von über 20 nach den Unternehmen gruppieren.
* Die Methode ``printThreeCompaniesWithLeastJobOffersFromEastWithHourlyRateAbove20()`` soll die drei Unternehmen mit den wenigsten Jobanzeigen aus East mit einem Stundenlohn von über 20 ausgeben. Hinweis: Um dir die Methode zu vereinfachen, kannst du die vorherige Methode verwenden.
* **Zusatzaufgabe:** Die Methode ``getAverageSalaryGroupedByCompany()`` soll für jedes Unternehmen das durchschnittliche Gehalt gruppieren. Die Methode ist etwas schwieriger. Daher probiere es gerne alternativ ohne Streams oder versuche wie in der Klausur möglichst viele Elemente der Methode zu implementieren, um Teilpunkte mitzunehmen. 
