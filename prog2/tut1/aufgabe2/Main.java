package prog2.tut1.aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		PartyPeople p1 = new PartyPeople("Jonas", 22, "männlich", 0);
		PartyPeople p2 = new PartyPeople("Anna", 22, "weiblich", 0);
		PartyPeople p3 = new PartyPeople("Max", 20, "männlich", 0);
		PartyPeople p4 = new PartyPeople("Lisa", 23, "weiblich", 0);
		PartyPeople p5 = new PartyPeople("Gregory", 24, "divers", 0);

		ArrayList<PartyPeople> partyPeople = new ArrayList<>(List.of(p1, p2, p3, p4, p5));

		Drink d1 = new Drink("Bier", 0.5);
		Drink d2 = new Drink("Wein", 0.8);
		Drink d3 = new Drink("Vodka", 1.5);
		Drink d4 = new Drink("Whiskey", 1.8);
		Drink d5 = new Drink("Wasser", 0.0);

		ArrayList<Drink> drinks = new ArrayList<>(List.of(d1, d2, d3, d4, d5));

		Georgstraße georgstraße = new Georgstraße(partyPeople, drinks, "11");

		System.out.println("=== Party startet ===");
		georgstraße.party();

		System.out.println("\n=== Stärkster Drink ===");
		Drink strongestDrink = georgstraße.findMostAlcDrink();
		System.out.println("Der Drink mit dem höchsten Alkoholgehalt ist: " + strongestDrink.name() + " (" + strongestDrink.alc() + "%)");
	}
}
