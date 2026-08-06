package prog2.tut1.aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Exam exam1 = new Exam("Jonas", 123456, null);
		Exam exam2 = new Exam("Joa", 123451, null);
		Exam exam3 = new Exam("Sven", 623453, null);
		Exam exam4 = new Exam("Bernd", 164334, null);
		Exam exam5 = new Exam("Rob", 126343, null);

		ArrayList<Exam> exams = new ArrayList<>(List.of(
				exam1, exam2, exam3, exam4, exam5
		));

		Aniel aniel = new Aniel(45, 10);

		for(Exam x : exams) {
			x.setGrade(aniel.evaluate());
		}

		EvaluationHelper eh = new EvaluationHelper();
		System.out.println(eh.failuresCount(exams));
		System.out.println(eh.passesCount(exams));
		System.out.println(eh.getAverage(exams));

	}


}
