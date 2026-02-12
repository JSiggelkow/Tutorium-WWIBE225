package aufgabe3;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {

		String[] module = {"Programmieren1", "LuA", "Recht"};
		double[] noten = {0,0,0};
		Scanner scanner = new Scanner(System.in);


		for (int i = 0; i < module.length; i++) {
			System.out.println("Bitte Note für " +  module[i] + " eingeben");
			noten[i] = scanner.nextDouble();
		}

		for (int i = 0; i < noten.length; i++) {
			System.out.println("Modul: " + module[i] + " | Note: " + noten[i]);
		}
	}

}




