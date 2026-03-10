package tut4.aufgabe1;

import java.util.ArrayList;
import java.util.Random;

public class SuesswarenAuswahl {
    private ArrayList<Suessware> suesswarenBeutel;
    private String name;

    private Random random = new Random();

    public SuesswarenAuswahl(String name) {
        this.name = name;
        suesswarenBeutel = new ArrayList<>();
    }

    public void addSuessware(Suessware suessware) {
        suesswarenBeutel.add(suessware);
    }

    public int getAnzahlAnSuesswaren() {
        return suesswarenBeutel.size();
    }

    public int getGesamteKalorien() {
        int tmp = 0;
        for (Suessware sw : suesswarenBeutel) {
            tmp += sw.getKalorien();
        }
        return tmp;
    }

    public Suessware preisWaehlen() {
        Suessware tmp = suesswarenBeutel.get(random.nextInt(suesswarenBeutel.size()));
        suesswarenBeutel.remove(tmp);
        return tmp;
    }

    public ArrayList<Suessware> getSuesswarenBeutel() {
        return suesswarenBeutel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SuesswarenAuswahl{" + "name='" + name + ", suesswarenBeutel=" + suesswarenBeutel + '}';
    }
}
