package prog2.tut1.aufgabe1;

import java.util.ArrayList;

public class EvaluationHelper {

	public int passesCount(ArrayList<Exam> exams) {
		int count = 0;
		for (Exam x : exams) {
			if (x.getGrade() < 4.1) count++;
		}
		return count;
	}

	public int failuresCount(ArrayList<Exam> exams) {
		int count = 0;
		for (Exam x : exams) {
			if (x.getGrade() > 4.0) count++;
		}
		return count;
	}

	public double getAverage(ArrayList<Exam> exams) {
		if (exams.isEmpty()) return 0;
		double sum = 0;
		for (Exam x : exams) {
			sum += x.getGrade();
		}
		return sum / exams.size();
	}
}
