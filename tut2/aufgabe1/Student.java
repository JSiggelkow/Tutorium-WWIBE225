package tut2.aufgabe1;

public class Student {
    private String firstName;
    private String lastName;
    private int matriculationNumber;

    public Student(String firstName, String lastName, int matriculationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matriculationNumber = matriculationNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getMatriculationNumber() {
        return matriculationNumber;
    }
    public void printInfo() {
        System.out.println(firstName + " " + lastName + " (" + matriculationNumber + ")");
    }
}
