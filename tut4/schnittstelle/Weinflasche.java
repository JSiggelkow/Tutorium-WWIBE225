package tut4.schnittstelle;

public class Weinflasche extends Flasche implements Drinkable{

	private int age;
	private double alkoholInProzent;


	public Weinflasche(String name, int ml, int age, double alkoholInProzent) {
		super(name, ml);
		this.age = age;
		this.alkoholInProzent = alkoholInProzent;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
			System.out.println("Zu Viiino saage ich Niiino");
			super.setMl(super.getMl() - ml);
		} else {
			System.out.println("Nicht genug mehr in der Weinflasche :(");
		}
	}
}
