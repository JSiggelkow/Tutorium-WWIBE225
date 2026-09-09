package prog2.tut7.aufgabe2;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Data
public class Tour implements Comparable<Tour> {
	private String name;
	private double lengthInKm;
	private double elevationGainInM;
	private List<WayPoint> wayPoints;

	@Override
	public int compareTo(@NotNull Tour o) {
		return Double.compare(o.lengthInKm, lengthInKm);
	}

	public void addWayPoint(WayPoint wayPoint) throws LatitudeException, LongitudeException {

		if (wayPoint.getLatitude() > 90 || wayPoint.getLatitude() < -90) {
			throw new LatitudeException();
		} else if (wayPoint.getLongitude() > 180 || wayPoint.getLongitude() < -180) {
			throw new LongitudeException();
		}

		wayPoints.add(wayPoint);
	}
}
