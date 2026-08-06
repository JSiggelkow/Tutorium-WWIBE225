package prog2.tut2.aufgabe1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

@Setter
@Getter
@ToString
public class Team {
	private String name;
	private ArrayList<Cyclist> cyclists;
	private String shortName;

	public Team(String name, String shortName) {
		this.name = name;
		cyclists = new ArrayList<>();
		this.shortName = shortName;
	}

	public void addCyclist(Cyclist c ) {
		cyclists.add(c);
	}

	public void sortCyclists() {
		Collections.sort(cyclists, Comparator.comparing(Cyclist::getPointsGeneral).reversed());
	}

	public List<Cyclist> filterCyclists(Predicate<Cyclist> condition) {
		List<Cyclist> result = new ArrayList<>();
		for (Cyclist cyclist : cyclists) {
			if (condition.test(cyclist)) {
				result.add(cyclist);
			}
		}
		return result;

		// mit stream
		// return cyclists.stream().filter(condition).toList();
	}

	public int getTotalPoints() {
		int total = 0;
		for (Cyclist c : cyclists) {
			total += c.getPointsGeneral();
		}
		return total;

        /*
        Alternative mit Stream:

        return cyclists.stream().mapToInt(Cyclist::getPointsGeneral).sum();
         */
	}
}
