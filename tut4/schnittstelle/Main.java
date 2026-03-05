package tut4.schnittstelle;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Bierflasche alt = new Bierflasche("Schlösser Alt", 500, 4.8);
		Weinflasche primitivo = new Weinflasche("Primitivo", 750, 2, 13);
		Wasserflasche sprudelwasser = new Wasserflasche("Sprudelwasser", 1000, true);
		Reinigungsflasche glasreiniger = new Reinigungsflasche("Glasreiniger", 1000, false);

		List<Flasche> flaschen = new ArrayList<>();
		flaschen.addAll(List.of(alt, primitivo, sprudelwasser, glasreiniger));

		for (Flasche f : flaschen) {
			if (f instanceof Drinkable getraenk) {
				getraenk.drink(200);
			} else {
				System.out.println("Lieber nicht trinken!: " + f);
			}
		}

	}
}
