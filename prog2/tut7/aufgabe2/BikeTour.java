package prog2.tut7.aufgabe2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@ToString
public class BikeTour extends Tour  {
	private final Bike bike;

	public BikeTour(String name, double lengthInKm, double elevationGainInM, List<WayPoint> wayPoints, Bike bike) {
		super(name, lengthInKm, elevationGainInM, wayPoints);
		this.bike = bike;
	}
}
