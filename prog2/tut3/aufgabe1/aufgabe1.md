# Come, Mr. DJ, won't you turn the music up?

Die Musik tönt, die Laser strahlen, die Tanzfläche ist voll, alle haben gute Laune, denn es ist wieder Party in der Kantine.  
Doch plötzlich fliegt ein Becher voll mit Vodka-Bull quer über die Tanzfläche direkt auf das DJ-Pult.
Die Musik geht aus und plötzlich ist alles still, ist der Abend jetzt ruiniert?   
Nein, denn wir haben ja kompetente Wirtschaftsinformatiker, die dem DJ jetzt aushelfen können!  
Erstelle die Klasse DJ aus dem Klassendiagramm und rette die Party!

Es kann davon ausgegangen werden, dass alle Klassen die entsprechenden Objekt-, Getter- und Setter-Methoden implementieren.
Aus Gründen der Übersicht sind die im Klassendiagramm nicht dargestellt.  
Methodennamen dürfen sinnvoll abgekürzt werden.

Der Konstruktor der Klasse DJ soll playlists als leere HashMap implementieren und dem DJ einen Namen geben.

Die Methode createEmptyPlaylist(playlistName: String) soll eine neue Playlist mit dem eingehenden Namen erstellen und true zurückgeben.  
Wenn es bereits eine Playlist mit dem Namen gibt, soll nur false zurückgegeben werden.

Die Methode addMusicToPlaylist(playlistName: String, music: Music) soll die eingehende Music der entsprechenden Playlist hinzufügen.  
Wenn keine entsprechende Playlist existiert, false zurückgeben, ansonsten true.

Die Methode getAllUniqueSongsByInterpretFromPlaylist(interpret: Interpret, playlistName: String) soll alle Songs, ohne Dopplungen, des übergebenen Interpreten aus der angegebenen Playlist als Liste zurückgeben.

Die Methode getSongsByGenreSortedByBpmDesc(genre: Genre, playlistName: String) soll alle Songs des übergebenen Genres aus der angegebenen Playlist absteigend nach BPM sortiert als Liste zurückgeben.

Die Methode getAverageRatingFromMusicInPlaylist(playlistName: String) soll das durchschnittliche Rating aller Songs der angegebenen Playlist zurückgeben.  
Ist die Playlist leer, soll eine PlaylistEmptyException geworfen werden.

Die Methode getMusicByGenreFromPlaylist(playlistName: String) soll die Songs der angegebenen Playlist gruppiert nach Genre als Map zurückgeben.


## Klassendiagramm

<img width="7210" height="4495" alt="RAG-2026-08-11-081247" src="https://github.com/user-attachments/assets/7964aba0-b38d-4eab-959a-7afa800bd4f9" />


<!--```mermaid
classDiagram
    class DJ {
        -playlists: Map~String, List<Music>~
        -name: String [final]
        +DJ(name: String)
        +createEmptyPlaylist(playlistName: String) boolean
        +addMusicToPlaylist(playlistName: String, music: Music) boolean
        +getAllUniqueSongsByInterpretFromPlaylist(interpret: Interpret, playlistName: String) List~Music~
        +getSongsByGenreSortedByBpmDesc(genre: Genre, playlistName: String) List~Music~
        +getAverageRatingFromMusicInPlaylist(playlistName: String) double
        +getMusicByGenreFromPlaylist(playlistName: String) Map~Genre, List<Music>~
    }

    class Music {
            <<record>>
        -title: String
        -interpret: Interpret
        -releaseDate: LocalDate
        -rating: Double
        -genre: Genre
        -bpm: int
        +Music(title: String, interpret: Interpret, releaseDate: LocalDate, rating: Double, genre: Genre, bpm: int)
    }

    class Genre {
        <<enumeration>>
        HOUSE
        TECHNO
        HIPHOP
        -description: String
        -minBPM: int
        -maxBPM: int
    }

    class Interpret {
        -name: String [final]
        -age: int
        -follower: int
        +Interpret(name: String)
    }

    class PlaylistEmptyException {
        +PlaylistEmptyException(message: String)
    }

    DJ o-- Music
    DJ o-- Genre
    DJ o-- Interpret 
    DJ ..> PlaylistEmptyException
    Music o-- Interpret
    Music o-- Genre
``` -->
