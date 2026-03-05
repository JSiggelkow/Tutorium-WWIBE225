package tut4.abstraktion;

public abstract class Getraenk {

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

	public abstract void drink(int ml);
}
