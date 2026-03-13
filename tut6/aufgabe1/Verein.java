package tut6.aufgabe1;

import java.util.ArrayList;

public abstract class Verein {
    private String name;
    private int gruendungsjahr;
    private Sportart sportart;

    public Verein (String name, int gruendungsjahr, Sportart sportart) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.sportart = sportart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGruendungsjahr() {
        return gruendungsjahr;
    }

    public void setGruendungsjahr(int gruendungsjahr) {
        this.gruendungsjahr = gruendungsjahr;
    }

    public Sportart getSportart() {
        return sportart;
    }

    public void setSportart(Sportart sportart) {
        this.sportart = sportart;
    }

    @Override
    public String toString() {
        return "Verein{" +
                "name='" + name + '\'' +
                ", gruendungsjahr=" + gruendungsjahr +
                ", sportart=" + sportart +
                '}';
    }
}
