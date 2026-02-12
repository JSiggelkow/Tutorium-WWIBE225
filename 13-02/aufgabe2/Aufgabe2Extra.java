package aufgabe2;

import java.util.Random;

public class Aufgabe2Extra {

	public static void main(String[] args) {
		Random random = new Random();
		int studentenAnzahl = 30;

		for (int i = 0; i < studentenAnzahl; i++) {
			double note = random.nextDouble(1, 6);
			String noteString = String.valueOf(note);
			System.out.println(noteString.charAt(0) + "." + noteString.charAt(2));
		}
	}
}
