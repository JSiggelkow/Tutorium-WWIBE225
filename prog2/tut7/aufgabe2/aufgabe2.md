# Aufgabe 2
Erstelle die Klassen Tour und Strava anhand des abgebildeten Klassendiagramms.  

<img width="1394" height="961" alt="aufgabe2 drawio-5" src="https://github.com/user-attachments/assets/8ee052ee-06c6-438d-b3a4-e648ee27319e" />


## Hinweise zur Klasse Tour
* Die Methode ```int compareTo(o: Tour)``` soll so implementiert werden, dass Touren absteigend nach ihrer Länge sortiert werden können.
* Die Methode ```void addWayPoint(wayPoint: WayPoint)``` soll den eingehenden WayPoint der Liste an WayPoints hinzufügen. Wenn der Breitengrad kleiner als -90 oder größer als 90 ist. soll eine LatitudeException geworfen werden. Wenn der Längengrad kleiner als -180 oder größer als 180 ist, soll eine LongitudeException geworfen werden.

## Hinweise zur Klasse Strava
* Die Methode ```void showAllTours()``` soll alle Touren in der Konsole ausgeben. Hierbei ist auf die genaue Unterscheidung der Art der Tour zu achten. Bei allen Touren, egal welcher Art, soll der Name sowie die Länge der Tour ausgegeben werden. Bei Bike Touren soll das genutzt Bike mit ausgegeben werden und bei Running Touren soll der genutzte Schuh mit ausgegebe werden:
### Beispielhafter Konsolen-Output:
```bash
RUNNINGTOUR: Name: Coffee Run | Length: 10,00 km | Gear: RunningShoes[brand=Nike, price=123.0, isCarbon=false]
TOUR: Name: Roadtrip | Length: 100,00 km
BIKETOUR: Name: Tour de Bodensee | Length: 257,04 km | Gear: Bike[brand=Cube, biketype=GRAVEL, size=M, isCarbon=false, price=1400.0]
```
