package tut4.aufgabe1;

public class Fruchtgummi extends Suessware {
    private String form;
    private int anzahlImBeutel;

    public Fruchtgummi(String name, double preis, int kalorien, String form, int anzahlImBeutel) {
        super(name, preis, kalorien);
        this.form = form;
        this.anzahlImBeutel = anzahlImBeutel;
    }

    public boolean istTeilbar(int personen) {
        return anzahlImBeutel % personen == 0;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getAnzahlImBeutel() {
        return anzahlImBeutel;
    }

    public void setAnzahlImBeutel(int anzahlImBeutel) {
        this.anzahlImBeutel = anzahlImBeutel;
    }

    @Override
    public String toString() {
        return super.toString() + "form='" + form + '\'' + ", anzahlImBeutel=" + anzahlImBeutel;
    }
}
