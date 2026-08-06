package prog1.tut7.aufgabe2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Dice d = new Dice();
		Scanner sc = new Scanner(System.in);

		System.out.print("Spieler 1, bitte Namen eingeben:");
		String player1 = sc.next();
		int p1Points = 0;

		System.out.print("Spieler 2, bitte Namen eingeben:");
		String player2 = sc.next();
		int p2Points = 0;

		System.out.printf("| Runde | %10s | %10s |%n", player1, player2);
		System.out.println("| ----- | ---------- | ---------- |");
		for (int i = 0; i < 5; i++) {

			int p1Value = d.rollTheDice() + d.rollTheDice() + d.rollTheDice();
			int p2Value = d.rollTheDice() + d.rollTheDice() + d.rollTheDice();

			System.out.printf("| %5d | %10d | %10d |%n", i, p1Value, p2Value);

			if (p1Value > p2Value) {
				p1Points++;
			} else if ((p2Value > p1Value)) {
				p2Points++;
			} else {
				p1Points++;
				p2Points++;
			}
		}

		System.out.println(player1 + ": " + p1Points + " Punkte");
		System.out.println(player2 + ": " + p2Points + " Punkte");


		if (p1Points > p2Points) {
			System.out.println(player1 + " gewinnt");
		} else if (p2Points > p1Points) {
			System.out.println(player2 + " gewinnt");
		} else {
			System.out.println("Unentschieden");
		}
	}
}
