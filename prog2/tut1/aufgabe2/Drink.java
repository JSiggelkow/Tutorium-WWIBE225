package prog2.tut1.aufgabe2;

import org.jetbrains.annotations.NotNull;

public record Drink(String name, double alc) implements Comparable<Drink> {

	@Override
	public int compareTo(@NotNull Drink o) {
		return Double.compare(alc, o.alc);
	}
}
