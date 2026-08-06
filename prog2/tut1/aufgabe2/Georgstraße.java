package prog2.tut1.aufgabe2;

import java.util.ArrayList;
import java.util.Random;

public class Georgstraße {

	private String hausnummer;
	private ArrayList<PartyPeople> partyPeople;
	private ArrayList<Drink> drinks;

	public Georgstraße(ArrayList<PartyPeople> partyPeople, ArrayList<Drink> drinks, String hausnummer) {
		this.hausnummer = hausnummer;
		this.partyPeople = partyPeople;
		this.drinks = drinks;
	}

	public void party() {
		for (int i = 0; i < 6; i++) {
			for (PartyPeople pP : partyPeople) {
				try {
					pP.drink(drinks.get(new Random().nextInt(0, drinks.size())));
				} catch (PolizeiException e) {
					System.out.println("Die Polizei kommt und nimmt " + pP.getName() + " mit.");
					System.out.println("Die Party wird abgebrochen");
					return;
				}
			}
		}
	}

	public Drink findMostAlcDrink() {
		Drink currentMostAlcDrink = drinks.getFirst();
		for (Drink d : drinks) {
			if (d.compareTo(currentMostAlcDrink) > 0) currentMostAlcDrink =d;
		}
		return currentMostAlcDrink;
	}
}
