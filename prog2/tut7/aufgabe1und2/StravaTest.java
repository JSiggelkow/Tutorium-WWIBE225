package prog2.tut7.aufgabe1und2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//Punkte: 10
public class StravaTest { //2,5
	BikeTour tourDeBodensee;
	Bike bike;
	RunningTour coffeeRun;
	RunningShoes shoes;
	Strava strava;

	@BeforeEach
	void setUp() {
		bike = new Bike("Cube", BikeType.GRAVEL, "M", false, 1400); // 0.5
		shoes = new RunningShoes("Nike", 200, false); //0.5
		tourDeBodensee = new BikeTour("Tour de Bodensee", 257.04, 1200, new ArrayList<>(), bike); //0.5
		coffeeRun = new RunningTour("Coffee Run", 10.00, 50, new ArrayList<>(), shoes ); //0.5

		strava = new Strava(new ArrayList<>()); //0.5
		strava.tours().add(coffeeRun); //0.5
		strava.tours().add(tourDeBodensee); //0.5
	}

	@Test
	void testComparingTour() {
		Collections.sort(strava.tours());
		assertEquals(tourDeBodensee, strava.tours().getFirst()); //2
	}

	@Test
	void testLongitudeException() {
		assertThrows(LongitudeException.class,() -> coffeeRun.addWayPoint(new WayPoint(50, 200, "REWE", PointOfInterest.SUPERMARKET))); //2
	}
}
