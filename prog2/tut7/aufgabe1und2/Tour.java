package prog2.tut7.aufgabe1und2;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Data
public class Tour implements Comparable<Tour> {
	private String name;
	private double lengthInKm;
	private double elevationGainInM;
	private List<WayPoint> wayPoints;

	public Tour(String name, double lengthInKm, double elevationGainInM, List<WayPoint> wayPoints) {
		this.name = name;
		this.lengthInKm = lengthInKm;
		this.elevationGainInM = elevationGainInM;
		this.wayPoints = wayPoints;
	}

	@Override
	public int compareTo(@NotNull Tour o) {
		return Double.compare(o.getLengthInKm(), getLengthInKm());
	}

	public void addWayPoint(WayPoint wayPoint) throws LatitudeException, LongitudeException {

		if (wayPoint.latitude() > 90 || wayPoint.latitude() < -90) {
			throw new LatitudeException();
		} else if (wayPoint.longitude() > 180 || wayPoint.longitude() < -180) {
			throw new LongitudeException();
		}

		wayPoints.add(wayPoint);
	}
}
