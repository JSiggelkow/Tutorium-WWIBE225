package tut4.abstraktion;

public class EnergyDrink extends Getraenk {

	private int koffeinInMg;

	public EnergyDrink(String name, int ml, int koffeinInMg) {
		super(name, ml);
		this.koffeinInMg = koffeinInMg;
	}

	public int getKoffeinInMg() {
		return koffeinInMg;
	}

	public void setKoffeinInMg(int koffeinInMg) {
		this.koffeinInMg = koffeinInMg;
	}

	@Override
	public void drink(int ml) {
		if (ml < super.getMl()) {
			System.out.println("Energieee! Ab ins Gym!");
			super.setMl(super.getMl() - ml);
		} else {
			System.out.println("Nicht genug Energy! Wie soll ich jetzt mein PR hitten?");
		}
	}
}
