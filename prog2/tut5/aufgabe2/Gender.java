package prog2.tut5.aufgabe2;

public enum Gender {
	M("male"),
	F("female"),
	D("diverse");

	private String description;

	Gender(String description) {
		this.description = description;
	}
}
