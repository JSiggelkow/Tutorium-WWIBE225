package prog2.tut3.aufgabe1;

public enum Genre {
	HOUSE("House", 118, 135),
	TECHNO("Techno", 128, 167),
	HIPHOP("Hip-Hop", 85, 110);

	private String description;
	private int minBPM;
	private int maxBPM;


	Genre(String description, int minBPM, int maxBPM) {
		this.description = description;
		this.minBPM = minBPM;
		this.maxBPM = maxBPM;
	}
}
