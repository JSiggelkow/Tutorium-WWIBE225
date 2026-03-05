package tut2.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Rennauto mcLaren = new Rennauto("McLaren", 405, 85);
		Rennauto ferrari = new Rennauto("Ferrari", 415, 70);
		Rennauto redBull = new Rennauto("RedBull", 410, 75);
		Rennauto mercedes = new Rennauto("Mercedes", 395, 95);

		ArrayList<Rennauto> cars = new ArrayList<>(List.of(mcLaren, ferrari, redBull, mercedes));

		Rennauto winner = cars.getFirst();
		int winningRacePower = 0;

		for (Rennauto c : cars) {
			int racePower = c.calculatePowerForRace(58);
			if (racePower > winningRacePower) {
				winningRacePower = racePower;
				winner = c;
			}
		}

		System.out.println(winner.getName() + " wins with " + winningRacePower + " power.");
	}
}
