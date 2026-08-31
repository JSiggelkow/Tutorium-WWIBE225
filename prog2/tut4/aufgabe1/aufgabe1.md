# Hoch hinaus geht's liebe Wanderfreunde!

Es ist Jausenpause, erschöpft sitzt du auf dem Boden und siehst unter dir Gestein und Berge liegen. Du bist an einem Berggipfel in den Alpen. 
Für die nächste Wanderung möchtest du einen Bergführer beauftragen, doch der Alpenverein hat die Übersicht über ihre Bergführer verloren.
Erstelle die Klasse ``Alpenverein`` aus dem Klassendiagramm und hilf dem Verein, sich zu organisieren.

Es kann davon ausgegangen werden, dass alle Klassen die entsprechenden Objekt-, Getter- und Setter-Methoden implementieren.
Aus Gründen der Übersicht sind die im Klassendiagramm nicht dargestellt.  
Methodennamen dürfen sinnvoll abgekürzt werden!

Der Konstruktor der Klasse ``Alpenverein`` soll ``hikes`` als leere HashMap implementieren.

Die Methode ``createNewMountainGuide(mountainGuide: MountainGuide)`` soll einen neuen Bergführer hinzufügen und für ihn eine Liste mit Wanderungen erstellen. Gibt es den Bergführer schon, soll false zurückgegeben werden, andernfalls true.

Die Methode ``addHikeToMountainGuide(mountainGuide: MountainGuide, hike: Hike)`` soll die Wanderung dem Bergführer hinzufügen. Wenn der übergebene Bergführer nicht in der Map existiert soll die Methode  
false zurückgeben, ansonsten true.

Die Methode ``getHikesSortedByLengthFromMountainGuide(mountainGuide: MountainGuide)`` soll alle Wanderungen des Bergführers nach der Länge aufsteigend sortieren und als Liste zurückgeben.

Die Methode ``getMountainsAbove3000FromMountainGuide(mountainGuide: MountainGuide)`` soll alle Wanderungen des Bergführers mit Bergen über 3000hm als Liste zurückgeben.

Die Methode ``getAverageRatingFromMountainGuide(mountainGuide: MountainGuide)`` soll das durchschnittliche Rating aller Wanderungen des Bergführers als OptionalDouble zurückgeben.

Die Methode ``getHikesSortedByElevationWithDifficultyT3FromMountainGuide(mountainGuide: MountainGuide)`` soll alle Wanderungen des Bergführers der Schwierigkeit T3 aufsteigend sortiert nach der Elevation als Liste zurückgeben.

Die Methode ``getHikesWithMountainFromMountainGuide(mountainGuide: MountainGuide, mountain: Mountain)`` soll alle Wanderungen des Bergführers mit dem eingehenden Berg als Liste zurückgeben.

Die Methode ``groupHikesByDifficultyFromMountainGuide(mountainGuide: MountainGuide)`` soll die Wanderungen des Bergführers nach den Schwierigkeiten gruppieren und als HashMap zurückgeben.


## Klassendiagramm

![MountainGuide Hike-2026-08-31-122647.png](MountainGuide%20Hike-2026-08-31-122647.png)
