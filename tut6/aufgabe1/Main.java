package tut6.aufgabe1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Verein> verine = ExamTask02.scanVerein(new File("tut6/aufgabe1/vereine.txt"));
        Vereinsverwaltung vwRavensburg = new Vereinsverwaltung();
        for (Verein verein : verine) {
            vwRavensburg.addVerein(verein);
        }
        System.out.println(vwRavensburg.getAeltestenVerein());
        System.out.println(vwRavensburg.getKuerzestenNamen());
    }
}
