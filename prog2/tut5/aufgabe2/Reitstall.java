package prog2.tut5.aufgabe2;

import java.util.*;
import java.util.stream.Collectors;

public class Reitstall {
	private String name;
	private final Map<Rider, Horse> data; //1,5

	public Reitstall(String name) { //1
		this.name = name;
		this.data = new HashMap<>();
	}

	public Optional<Horse> getHorseByRider(Rider rider) { // 0,5
		return Optional.of(data.get(rider)); //2
	}

	public List<Horse> getAllHorsesByType(Type type) { //0.5
		return data.values().stream()
				.filter(h -> h.type() == type)
				.toList(); //2
	}

	public double getAverageRating() throws Exception { //0.5
		OptionalDouble oD = data.keySet().stream()
				.mapToDouble(Rider::rating)
				.average(); //2.5
		if (oD.isEmpty()) {
			throw new Exception(); //1
		}
		return oD.getAsDouble(); //0.5
	}

	public Map<Type, List<Horse>> getHorsesGroupedByType() { //0.5
		return data.values().stream()
				.collect(Collectors.groupingBy(Horse::type)); //2.5
	}

}
