package tut4.vererbung;

public class Getraenk {

	private String name;
	private int ml;

	public Getraenk(String name, int ml) {
		this.name = name;
		this.ml = ml;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

	public void drink(int ml) {
		if (ml < this.ml) {
			System.out.println("Das Getränk ist lecker");
			this.ml -= ml;
		} else {
			System.out.println("Nicht genug Getränk da");
		}
	}

	@Override
	public String toString() {
		return "Getraenk{" +
				"name='" + name + '\'' +
				", ml=" + ml +
				'}';
	}
}
