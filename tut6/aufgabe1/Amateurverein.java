package tut6.aufgabe1;

public class Amateurverein extends Verein implements Bewertbar {
    private int mitgliederanzahl;
    private int ehrenamtlicheHelfer;
    private double jahresbeitrag;

    public Amateurverein(String name, int gruendungsjahr, Sportart sportart, int mitgliederanzahl, int ehrenamtlicheHelfer, double jahresbeitrag) {
        super(name, gruendungsjahr, sportart);
        this.mitgliederanzahl = mitgliederanzahl;
        this.ehrenamtlicheHelfer = ehrenamtlicheHelfer;
        this.jahresbeitrag = jahresbeitrag;
    }

    public boolean organisiereTurnier(int anzahlTeams) {
        if (ehrenamtlicheHelfer > anzahlTeams) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double berechneGesamtBewertung() {
        return (double) ehrenamtlicheHelfer /mitgliederanzahl;
    }

    @Override
    public String getBewertungstext() {
        return berechneGesamtBewertung() > 30 ? "Gold" : "Bronze";
    }

    public int getMitgliederanzahl() {
        return mitgliederanzahl;
    }

    public void setMitgliederanzahl(int mitgliederanzahl) {
        this.mitgliederanzahl = mitgliederanzahl;
    }

    public double getJahresbeitrag() {
        return jahresbeitrag;
    }

    public void setJahresbeitrag(double jahresbeitrag) {
        this.jahresbeitrag = jahresbeitrag;
    }

    public int getEhrenamtlicheHelfer() {
        return ehrenamtlicheHelfer;
    }

    public void setEhrenamtlicheHelfer(int ehrenamtlicheHelfer) {
        this.ehrenamtlicheHelfer = ehrenamtlicheHelfer;
    }

    @Override
    public String toString() {
        return super.toString() +
                " mitgliederanzahl=" + mitgliederanzahl +
                ", ehrenamtlicheHelfer=" + ehrenamtlicheHelfer +
                ", jahresbeitrag=" + jahresbeitrag +
                '}';
    }
}
