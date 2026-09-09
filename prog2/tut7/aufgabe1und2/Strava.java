package prog2.tut7.aufgabe1und2;

import java.util.List;
// Punkte: 5
public record Strava(List<Tour> tours) { // 0.5
	public void showAllTours() {
		for (Tour t : tours) {
			if (t instanceof BikeTour b) { //1.5
				System.out.printf("BIKETOUR: Name: %s | Length: %.2f km | Gear: %s%n", b.getName(), b.getLengthInKm(), b.getBike().toString());
			} else if (t instanceof RunningTour r) { //1.5
				System.out.printf("RUNNINGTOUR: Name: %s | Length: %.2f km | Gear: %s%n", r.getName(), r.getLengthInKm(), r.getRunningShoes().toString());
			} else { //1.5
				System.out.printf("TOUR: Name: %s | Length: %.2f km%n", t.getName(), t.getLengthInKm());
			}
		}
	}
}
