package prog2.tut6.klausur24.aufgabe3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public record CityQueries(List<City> cities) { // 1

	public Map<Gender, List<Major>> getAllMajorsByGender() {
		return cities.stream()
				.map(City::major) // 0.5
				.collect(Collectors.groupingBy(Major::gender)); // 2
	}

	public List<String> getAllNamesFromCitiesInEuropeWithMoreThan1MioInhabitants() { // 0.5
		return cities.stream()
				.filter(c -> c.geoLocation() == GeoLocation.EUROPE) // 1.5
				.filter(c -> c.inhabitants() > 1_000_000) // 1.5
				.map(City::name) // 0.5
				.toList(); // 0.5
	}

	public Optional<String> getNameOfMajorByNameOfCity(String nameOfCity) { // 0.5
		return cities.stream()
				.filter(c -> c.name().equals(nameOfCity)) // 1.5
				.map(c -> c.major().name()) // 1.5
				.findFirst(); // 0.5
	}

	public double getTotalAreaInKm2OfAllCitiesWithFemaleMajors() { // 0.5
		return cities.stream()
				.filter(c -> c.major().gender().equals(Gender.FEMALE)) // 1.5
				.mapToDouble(City::areaInKm2) // 1
				.sum(); // 0.5
	}

	public void printCityWithMostPointsOfInterest() {
		cities.stream()
				.max(Comparator.comparing(c -> c.pointsOfInterests().size())) // 2
				.ifPresent(c -> System.out.printf("[%s] ([%d])", c.name(), c.pointsOfInterests().size())); // 2
	}
}
