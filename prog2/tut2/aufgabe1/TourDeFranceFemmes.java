package prog2.tut2.aufgabe1;

public class TourDeFranceFemmes {
    public static void main(String[] args) {
        Cyclist c1 = new Cyclist("Demi Vollering", 29, "GC rider");
        Cyclist c2 = new Cyclist("Franziska Koch", 26, "GC Supporter");
        Cyclist c3 = new Cyclist("Antonia Niedermaier", 23, "GC Rider");
        Cyclist c4 = new Cyclist("Lorena Wiebes", 27, "Sprinter");
        Cyclist c5 = new Cyclist("Puck Pieterse", 24, "Climber");

        Team t1 = new Team("FDJ United - SUEZ", "FDJ");
        t1.addCyclist(c1);
        t1.addCyclist(c2);

        Team t2 = new Team("CANYON/SRAM", "CSR");
        t2.addCyclist(c3);

        Team t3 = new Team("Team SD Worx - Protime", "SDW");
        t3.addCyclist(c4);

        Team t4 = new Team("Fenix-Premier Tech", "FPT");
        t4.addCyclist(c5);

        Etappe e1 = new Etappe("1", 138, 1545);
        e1.rate(c4, 1, Category.YELLOW);
        e1.rate(c1, 3, Category.YELLOW);
        e1.rate(c5, 4, Category.YELLOW);
        e1.rate(c2, 22, Category.YELLOW);

        t1.sortCyclists();
        System.out.println("Die Fahrerin aus dem Team " + t1.getName() + " mit den meisten gelben Punkten ist " + t1.getCyclists().getFirst().getName());

        System.out.println("Das Team " + t1.getName() + " hat " + t1.getTotalPoints() + " Punkte insgesamt.");
    }


}
