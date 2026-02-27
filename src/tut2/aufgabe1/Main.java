package Termin2_OO.Aufgabe1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Gregory", "Peck", 1234567);
        Student s2 = new Student("Donald", "Duck", 1111111);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        for (Student s : students) {
            s.printInfo();
        }

    }
}
