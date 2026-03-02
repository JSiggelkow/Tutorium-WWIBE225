package tut3.aufgabe1;

public class Formular {
    private Double wunschNote;
    private Double aktuelleNote;
    private int lernaufwand;

    public Formular(Double wunschNote, Double aktuelleNote, int lernaufwand) {
        this.wunschNote = wunschNote;
        this.aktuelleNote = aktuelleNote;
        this.lernaufwand = lernaufwand;
    }

    public Double getWunschNote() {
        return wunschNote;
    }

    public void setWunschNote(Double wunschNote) {
        this.wunschNote = wunschNote;
    }

    public Double getAktuelleNote() {
        return aktuelleNote;
    }

    public void setAktuelleNote(Double aktuelleNote) {
        this.aktuelleNote = aktuelleNote;
    }

    public int getLernaufwand() {
        return lernaufwand;
    }

    public void setLernaufwand(int lernaufwand) {
        this.lernaufwand = lernaufwand;
    }

    public String toString(){
        return "Wunschnote: " + wunschNote + ", aktuelle Note: " + aktuelleNote +", Lernaufwand: " + lernaufwand;
    }
}
