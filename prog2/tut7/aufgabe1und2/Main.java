package prog2.tut7.aufgabe1und2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Bike cube = new Bike("Cube", BikeType.GRAVEL, "M", false, 1400);
		RunningShoes jonasShoes = new RunningShoes("Nike", 123, false);

		RunningTour coffeeRun = new RunningTour("Coffee Run", 10, 50, new ArrayList<>(), jonasShoes);
		BikeTour bodenseeRide = new BikeTour("Tour de Bodensee", 257.04, 1200, new ArrayList<>(), cube);
		Tour defaultTour = new Tour("Roadtrip", 100, 50, new ArrayList<>());

		Strava strava = new Strava(new ArrayList<>(List.of(coffeeRun, defaultTour, bodenseeRide)));
		strava.showAllTours();
	}
}
