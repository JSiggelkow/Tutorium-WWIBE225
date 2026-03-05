package tut4.schnittstelle;

public class Wasserflasche extends Flasche implements Drinkable {

	private boolean mitSprudel;

	public Wasserflasche(String name, int ml, boolean mitSprudel) {
		super(name, ml);
		this.mitSprudel = mitSprudel;
	}

	public boolean isMitSprudel() {
		return mitSprudel;
	}

	public void setMitSprudel(boolean mitSprudel) {
		this.mitSprudel = mitSprudel;
	}

	@Override
	public void drink(int ml) {
		if (ml < super.getMl()) {
			System.out.println("Lecker Wasser, gut für Geist und Seele!");
			super.setMl(super.getMl() - ml);
		} else {
			System.out.println("Ich habe Durst! Ich brauche mehr Wasser");
		}
	}
}
