package prog2.tut2.examples;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class F1Championship {

	public static void main(String[] args) {
		List<Driver> drivers = Arrays.asList(
				new Driver("Max Verstappen", "Red Bull Racing", 575, 27, "Netherlands"),
				new Driver("Lewis Hamilton", "Ferrari", 307, 39, "UK"),
				new Driver("Charles Leclerc", "Ferrari", 307, 26, "Monaco"),
				new Driver("George Russell", "Mercedes", 175, 26, "UK"),
				new Driver("Oscar Piastri", "McLaren", 97, 23, "Australia")
		);

		// lokale Klasse
		class PointsComparator implements Comparator<Driver> {
			@Override
			public int compare(Driver d1, Driver d2) {
				return Integer.compare(d2.getPoints(), d1.getPoints());
			}
		}

		// anonyme Klasse
		List<Driver> sortedByPointsAnonymeKlasse = new ArrayList<>(drivers);
		sortedByPointsAnonymeKlasse.sort(new Comparator<Driver>() {
			@Override
			public int compare(Driver d1, Driver d2) {
				return Integer.compare(d1.getPoints(), d2.getPoints());
			}
		});

		// lambda
		List<Driver> sortedByPointsLambda = new ArrayList<>(drivers);
		sortedByPointsLambda.sort((d1, d2) -> Integer.compare(d1.getPoints(), d2.getPoints()));

		// method reference
		List<Driver> sortedByPointsMethodReference = new ArrayList<>(drivers);
		sortedByPointsMethodReference.sort(Comparator.comparing(Driver::getPoints).reversed());
		sortedByPointsMethodReference.forEach(System.out::println);

		// multiple comparators
		List<Driver> sortedByPointsAndAge = new ArrayList<>(drivers);
		sortedByPointsAndAge.sort(
				Comparator.comparing(Driver::getPoints).reversed()
						.thenComparing(Driver::getAge));
		sortedByPointsAndAge.forEach(System.out::println);

		// java api usefully functional interfaces
		Predicate<Driver> isYoung = driver -> driver.getAge() < 27;

		Consumer<Driver> printDriverInfo = driver ->
				System.out.println(driver.getName() + " fährt für " + driver.getTeam());

	}
}