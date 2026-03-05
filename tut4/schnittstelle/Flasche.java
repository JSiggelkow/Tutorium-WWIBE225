package tut4.schnittstelle;

public abstract class Flasche {

	private String name;
	private int ml;

	public Flasche(String name, int ml) {
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

	@Override
	public String toString() {
		return "Flasche{" +
				"name='" + name + '\'' +
				", ml=" + ml +
				'}';
	}
}
