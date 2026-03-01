package tut2.aufgabe2;

public class Player {
    private String name;
    private int goals;

    public Player(String name) {
        this.name = name;
        goals = 0;
    }
    public void scoreGoal() {
        goals++;
    }
    public String getName() {
        return name;
    }
    public int getGoals() {
        return goals;
    }
}
