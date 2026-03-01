package tut1.aufgabe2;

import java.util.Random;

public class Aufgabe2 {

	public static void main(String[] args) {
		Random random = new Random();
		int studentenAnzahl = 30;

		for (int i = 0; i < studentenAnzahl; i++) {
			int note = random.nextInt(1, 6);
			System.out.println(note);
		}
	}
}
