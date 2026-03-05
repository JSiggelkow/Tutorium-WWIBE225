package tut4.abstraktion;


import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		EnergyDrink redBull = new EnergyDrink("RedBull", 500, 160);
		Wein primitivo = new Wein("Primitivo", 750, 2, 13);
		Wasser wasserflasche = new Wasser("BigBottle", 2000, false);
		Glasreiniger glasreiniger = new Glasreiniger("Glasreiniger", 1000, false);
		// Getraenk getraenk = new Getraenk("Getränk", 750) //geht nicht, weil abstrakt
		List<Getraenk> getraenke = new ArrayList<>();
		getraenke.add(redBull);
		getraenke.add(primitivo);
		getraenke.add(wasserflasche);
		getraenke.add(glasreiniger);

		for (Getraenk g : getraenke) {
			g.drink(100);
		}
	}
}
