package prog2.tut2.aufgabe1;

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

    /*
    Lombok:
    @Getter
    */

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRoleInTeam() {
        return roleInTeam;
    }

    public int getPointsGreen() {
        return pointsGreen;
    }

    public int getPointsDotted() {
        return pointsDotted;
    }

    public int getPointsGeneral() {
        return pointsGeneral;
    }

    public void setRoleInTeam(String roleInTeam) {
        this.roleInTeam = roleInTeam;
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