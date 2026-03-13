package tut6.aufgabe1;

public class Profiverein extends Verein implements Bewertbar{
    private int kaderGroesse;
    private double jahresbudget;

    public Profiverein(String name, int gruendungsjahr, Sportart sportart, int kaderGroesse, double jahresbudget) {
        super(name, gruendungsjahr, sportart);
        this.kaderGroesse = kaderGroesse;
        this.jahresbudget = jahresbudget;
    }

    public boolean verpflichteSpieler(double gehalt) {
        if (jahresbudget/kaderGroesse > gehalt) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double berechneGesamtBewertung() {
        return jahresbudget/kaderGroesse;
    }

    @Override
    public String getBewertungstext() {
        return berechneGesamtBewertung() > 100_000 ? "Bundesliga-Niveau" : "Kreisliga-Niveau";
    }

    public int getMitgliederanzahl() {
        return kaderGroesse;
    }

    public double getJahresbeitrag() {
        return jahresbudget/kaderGroesse;
    }



    public int getKaderGroesse() {
        return kaderGroesse;
    }

    public void setKaderGroesse(int kaderGroesse) {
        this.kaderGroesse = kaderGroesse;
    }

    public double getJahresbudget() {
        return jahresbudget;
    }

    public void setJahresbudget(double jahresbudget) {
        this.jahresbudget = jahresbudget;
    }

    @Override
    public String toString() {
        return super.toString() + "Profiverein{" +
                "kaderGroesse=" + kaderGroesse +
                ", jahresbudget=" + jahresbudget +
                '}';
    }
}
