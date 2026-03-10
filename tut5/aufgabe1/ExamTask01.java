package tut5.aufgabe1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamTask01 { //0,5

	private static String lernaufwandInStunden; //0,5
	private static List<Modul> module; //0,5
	private static int sum; //0,5

	public static void main(String[] args) throws FileNotFoundException { //0,5

		Scanner sc = new Scanner(System.in); //1
		System.out.print("Lernaufwand in Stunden eingeben:"); //0,5

		lernaufwandInStunden = sc.nextLine(); //1

		module = scanModule(new File("tut5/aufgabe1/module.txt")); //1

		sum = 0; //0,5

		for (Modul m : module) { //1
			sum += m.getLernaufwandInStunden(); //1
		}

		if (sum > Integer.valueOf(lernaufwandInStunden)) { //1
			System.out.println("Du musst mehr lernen!"); //0,5
		} else {
			System.out.println("Du lernst genug!"); //0,5
		}

		sc.close(); // 0,5

	}

	public static List<Modul> scanModule(File file) throws FileNotFoundException { //0,5 + 0,5

		Scanner sc = new Scanner(file); // 0,5

		List<Modul> module = new ArrayList<>(); //0,5

		while (sc.hasNextLine()) { //1
			String line = sc.nextLine(); //1

			String[] tokens = line.split(";"); //1

			Modul tempModul = new Modul(tokens[0], Integer.valueOf(tokens[1])); // 3

			module.add(tempModul); //0,5
		}

		sc.close(); //0,5

		return module; //0,5
	}
}
