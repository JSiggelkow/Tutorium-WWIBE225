package prog2.tut7.aufgabe2;

import java.util.List;

public record Strava<T extends Tour>(List<T> tours) {
	public void showAllTours() {
		for (Tour t : tours) {
			if (t instanceof BikeTour b) {
				System.out.printf("Name: %s%nLength: %f km%n Gear: %s%n", b.getName(), b.getLengthInKm(), b.getBike().toString());
			} else if (t instanceof RunningTour r) {
				System.out.printf("Name: %s%nLength: %f km%n Gear: %s%n", r.getName(), r.getLengthInKm(), r.getRunningShoes().toString());
			} else {
				System.out.printf("Name: %s%nLength: %f km%n", t.getName(), t.getLengthInKm());
			}
		}
	}
}
