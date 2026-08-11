package prog2.tut3.aufgabe1;

import java.time.LocalDate;

public record Music(String title, Interpret interpret, LocalDate releaseDate, Double rating, Genre genre, int bpm) {
}
