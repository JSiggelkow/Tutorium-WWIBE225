package prog2.tut5.aufgabe2;

import org.jetbrains.annotations.NotNull;

public record Rider(String name, int age, Gender gender, boolean isCompetitive, double rating) implements Comparable<Rider> { //2,5
	@Override
	public int compareTo(@NotNull Rider r) { //0,5
		return Double.compare(r.rating, rating); //2
	}
}
