package prog2.tut1.aufgabe2;

public class PartyPeople {

	private final String name;
	private int age;
	private String gender;
	private double alc;

	public PartyPeople(String name, int age, String gender, double alc) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.alc = alc;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAlc() {
		return alc;
	}

	public void setAlc(double alc) {
		this.alc = alc;
	}

	public void drink(Drink drink) throws PolizeiException {
		this.alc += drink.alc();
		if (this.alc >= 3.0) {
			System.out.println(name + " fängt an zu randalieren");
			throw new PolizeiException();
		}
	}
}
