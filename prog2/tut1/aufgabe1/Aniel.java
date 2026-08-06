package prog2.tut1.aufgabe1;

import java.util.Random;

public class Aniel {
	private int age;
	private int motivation;

	public Aniel(int age, int motivation) {
		this.age = age;
		this.motivation = motivation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMotivation() {
		return motivation;
	}

	public void setMotivation(int motivation) {
		this.motivation = motivation;
	}

	public double evaluate() {
		return Math.round(new Random().nextDouble(1.0, 6.0) * 10.0) / 10.0;
	}
}
