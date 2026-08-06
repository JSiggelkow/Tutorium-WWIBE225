package prog2.tut2.aufgabe1;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Cyclist {
    private String name;
    private int age;
    private String roleInTeam;
    private int pointsGreen;
    private int pointsDotted;
    private int pointsGeneral;

    public Cyclist(String name, int age, String roleInTeam) {
        this.name = name;
        this.age = age;
        this.roleInTeam = roleInTeam;
        this.pointsGreen = 0;
        this.pointsDotted = 0;
        this.pointsGeneral = 0;
    }

    public void addPointsGreen(int pointsGreen) {
        this.pointsGreen += pointsGreen;
    }

    public void addPointsDotted(int pointsDotted) {
        this.pointsDotted += pointsDotted;
    }

    public void addPointsGeneral(int pointsGeneral) {
        this.pointsGeneral += pointsGeneral;
    }
}