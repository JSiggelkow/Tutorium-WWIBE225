package tut3.aufgabe2;

public class Staat {
    private String name;
    private int anzahlSoldaten;
    private int anzahlFlugzeuge;

    public Staat(String name, int anzahlSoldaten, int anzahlFlugzeuge) {
        this.name = name;
        this.anzahlSoldaten = anzahlSoldaten;
        this.anzahlFlugzeuge = anzahlFlugzeuge;
    }

    public void defend(int angriffStaerke) {
        anzahlSoldaten -= angriffStaerke;
        if (anzahlSoldaten < 0) {
            anzahlSoldaten = 0;
        }
    }

    public void surrender() {
        anzahlSoldaten = 0;
        anzahlFlugzeuge = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlSoldaten() {
        return anzahlSoldaten;
    }

    public void setAnzahlSoldaten(int anzahlSoldaten) {
        this.anzahlSoldaten = anzahlSoldaten;
    }

    public int getAnzahlFlugzeuge() {
        return anzahlFlugzeuge;
    }

    public void setAnzahlFlugzeuge(int anzahlFlugzeuge) {
        this.anzahlFlugzeuge = anzahlFlugzeuge;
    }

    public String printStatus() {
        return "Staat: " + name + ", Anzahl Soldaten: " + anzahlSoldaten + ", Anzahl Flugzeuge: " + anzahlFlugzeuge;
    }
}
