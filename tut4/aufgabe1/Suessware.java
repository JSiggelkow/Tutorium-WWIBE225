package tut4.aufgabe1;

public abstract class Suessware {
    private String name;
    private double preis;
    private int kalorien;

    public Suessware(String name, double preis, int kalorien) {
        this.name = name;
        this.preis = preis;
        this.kalorien = kalorien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getKalorien() {
        return kalorien;
    }

    public void setKalorien(int kalorien) {
        this.kalorien = kalorien;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", preis=" + preis + ", kalorien=" + kalorien + ", ";
    }
}
