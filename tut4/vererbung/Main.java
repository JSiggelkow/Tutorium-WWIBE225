package tut4.vererbung;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		EnergyDrink redBull = new EnergyDrink("RedBull", 500, 160);
		Wein primitivo = new Wein("Primitivo", 750, 2, 13);
		Wasser wasserflasche = new Wasser("BigBottle", 2000, false);
		Getraenk getraenk = new Getraenk("Mystery", 420); // In der realen Welt gibt es kein "abstraktes" Getränke!

		List<Getraenk> getraenke = new ArrayList<>();
		getraenke.add(redBull);
		getraenke.add(primitivo);
		getraenke.add(wasserflasche);
		getraenke.add(getraenk);

		for (Getraenk g : getraenke) {
			g.drink(200);
		}
	}
}
