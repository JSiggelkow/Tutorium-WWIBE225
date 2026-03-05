package tut2.aufgabe3;

public class Rennauto {
	private final String name;
	private final int hp;
	private int battery;

	public Rennauto(String name, int hp, int battery) {
		this.name = name;
		this.hp = hp;
		this.battery = battery;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int calculatePowerForRace(int rounds) {
		int powerForRace = 0;
		for (int i = 0; i < rounds; i++) {
			powerForRace += hp;
			powerForRace += battery;
			if (battery > 0) battery--;
		}
		return powerForRace;
	}
}
