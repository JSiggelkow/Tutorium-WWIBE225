package prog2.tut7.aufgabe2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class StravaTest {
	BikeTour tourDeBodensee;
	Bike bike;
	RunningTour coffeeRun;
	RunningShoes shoes;
	Strava strava;

	@BeforeEach
	void setUp() {
		bike = new Bike("Cube", BikeType.GRAVEL, "M", false, 1400);
		shoes = new RunningShoes("Nike", 200, false);
		tourDeBodensee = new BikeTour("Tour de Bodensee", 257.04, 1200, new ArrayList<>(), bike);
		coffeeRun = new RunningTour("Coffee Run", 10.00, 50, new ArrayList<>(), shoes );

		strava = new Strava(new ArrayList<>());
		strava.tours().add(coffeeRun);
		strava.tours().add(tourDeBodensee);
	}

	@Test
	void testComparingTour() {
		Collections.sort(strava.tours());
		assertEquals(tourDeBodensee, strava.tours().getFirst());
	}

	@Test
	void testLongitudeException() {
		assertThrows(LongitudeException.class,() -> coffeeRun.addWayPoint(new WayPoint(50, 200, "REWE", PointOfInterest.SUPERMARKET)));
	}
}
