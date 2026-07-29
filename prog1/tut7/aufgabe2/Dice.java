package prog1.tut7.aufgabe2;

import java.util.Random;

public class Dice {

	public int rollTheDice() {
		Random random = new Random();
		return random.nextInt(1, 7);
	}
}
