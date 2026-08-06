package prog2.tut2.aufgabe1;

import java.util.ArrayList;
import java.util.Collections;

public class Team {
    private String name;
    private ArrayList<Cyclist> cyclists;
    private String shortName;

    public Team(String name, String shortName) {
        this.name = name;
        cyclists = new ArrayList<>();
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cyclist> getCyclists() {
        return cyclists;
    }

    public void addCyclist(Cyclist cyclist) {
        cyclists.add(cyclist);
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void sortCyclists() {
        Collections.sort(cyclists, (c1, c2) -> c2.getPointsGeneral() - c1.getPointsGeneral());
    }

    public int getTotalPoints() {
        int total = 0;
        for (Cyclist c : cyclists) {
            total += c.getPointsGeneral();
        }
        return total;

        /*
        Alternative mit Stream:

        return cyclists.stream().mapToInt(Cyclist::getPointsGeneral).sum();
         */
    }
}
