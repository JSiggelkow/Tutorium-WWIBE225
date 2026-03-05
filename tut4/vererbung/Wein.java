package tut4.vererbung;

public class Wein extends Getraenk {

	private int age;
	private double alkoholInProzent;


	public Wein(String name, int ml, int age, double alkoholInProzent) {
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
			System.out.println("Zuuu Vino saage ich Niiiinooo!");
			super.setMl(super.getMl() - ml);
		} else {
			System.out.println("Neeeein! Der Wein ist leer :(");
		}
	}

	@Override
	public String toString() {
		return "Wein{" +
				"age=" + age +
				", alkoholInProzent=" + alkoholInProzent +
				"} " + super.toString();
	}
}
