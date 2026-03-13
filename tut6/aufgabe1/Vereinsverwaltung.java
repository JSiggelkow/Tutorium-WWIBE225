package tut6.aufgabe1;

import java.util.ArrayList;

public class Vereinsverwaltung {
    private ArrayList<Verein> vereine;

    public Vereinsverwaltung() {
        vereine = new ArrayList<>();
    }

    public void addVerein(Verein verein) {
        vereine.add(verein);
    }

    public Verein getAeltestenVerein() {
        Verein tmp = vereine.get(0);
        for (Verein verein : vereine) {
            if (verein.getGruendungsjahr() < tmp.getGruendungsjahr()) {
                tmp = verein;
            }
        }
        return tmp;
    }

    public Verein getKuerzestenNamen() {
        Verein tmp = vereine.get(0);

        for (Verein verein : vereine) {
            if (verein.getName().length() < tmp.getName().length()) {
                tmp = verein;
            }
        }
        return tmp;
    }
}
