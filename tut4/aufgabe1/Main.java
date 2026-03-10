package tut4.aufgabe1;

public class Main {
    public static void main(String[] args) {
        Schokoriegel snickers = new Schokoriegel("Snickers", 1.39, 240, 35, true);
        Schokoriegel mars = new Schokoriegel("Mars", 1.39, 220, 30, false);
        Fruchtgummi haribo = new Fruchtgummi("Haribo", 0.99, 350, "Bär", 46);

        SuesswarenAuswahl kahootGewinn = new SuesswarenAuswahl("Tutorium 4: Kahoot-Gewinn");
        kahootGewinn.addSuessware(snickers);
        kahootGewinn.addSuessware(mars);
        kahootGewinn.addSuessware(haribo);

        Suessware preis = kahootGewinn.preisWaehlen();

        if(preis instanceof Fruchtgummi) {
            System.out.println("Der Preis ist ein Fruchtgummi. Ist es teilbar? " + ((Fruchtgummi) preis).istTeilbar(2));
        } else {
            System.out.println("Das ist der Preis: " + preis);
        }
    }
}
