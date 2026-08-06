package prog2.tut1.aufgabe1;

public class Exam {
	private String name;
	private int mnr;
	private Double grade;

	public Exam(String name, int mnr, Double grade) {
		this.name = name;
		this.mnr = mnr;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMnr() {
		return mnr;
	}

	public void setMnr(int mnr) {
		this.mnr = mnr;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}
