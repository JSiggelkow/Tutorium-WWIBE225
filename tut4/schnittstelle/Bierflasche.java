package tut4.schnittstelle;

public class Bierflasche extends Flasche implements Drinkable{

	private double alkoholInProzent;

	public Bierflasche(String name, int ml, double alkoholInProzent) {
		super(name, ml);
		this.alkoholInProzent = alkoholInProzent;
	}

	public double getAlkoholInProzent() {
		return alkoholInProzent;
	}

	public void setAlkoholInProzent(double alkoholInProzent) {
		this.alkoholInProzent = alkoholInProzent;
	}

	@Override
	public void drink(int ml) {
		if (ml < super.getMl()) {
			System.out.println("Proooooost!");
			super.setMl(super.getMl() - ml);
		} else {
			System.out.println("Ich brauche ein neues Alt!");
		}
	}
}
