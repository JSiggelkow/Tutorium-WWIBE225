package tut5.aufgabe1;

public class Modul {
	private String name;
	private int lernaufwandInStunden;

	public Modul(String name, int lernaufwandInStunden) {
		this.name = name;
		this.lernaufwandInStunden = lernaufwandInStunden;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLernaufwandInStunden() {
		return lernaufwandInStunden;
	}

	public void setLernaufwandInStunden(int lernaufwandInStunden) {
		this.lernaufwandInStunden = lernaufwandInStunden;
	}
}
