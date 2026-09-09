package prog2.tut7.aufgabe1und2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
