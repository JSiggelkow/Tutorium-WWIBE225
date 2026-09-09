package prog2.tut7.aufgabe2;

import java.util.List;

public record Strava(List<Tour> tours) {
	public void showAllTours() {
		for (Tour t : tours) {
			if (t instanceof BikeTour b) {
				System.out.printf("BIKETOUR: Name: %s | Length: %.2f km | Gear: %s%n", b.getName(), b.getLengthInKm(), b.getBike().toString());
			} else if (t instanceof RunningTour r) {
				System.out.printf("RUNNINGTOUR: Name: %s | Length: %.2f km | Gear: %s%n", r.getName(), r.getLengthInKm(), r.getRunningShoes().toString());
			} else {
				System.out.printf("TOUR: Name: %s | Length: %.2f km%n", t.getName(), t.getLengthInKm());
			}
		}
	}
}
