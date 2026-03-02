package tut3.aufgabe2;

public class Main {
    public static void main(String[] args) {
        Staat israel = new Staat("Israel", 130000, 1300);
        Staat iran = new Staat("Iran", 240000, 250);
        Staat usa = new Staat("Usa", 750000, 25000);

        israel.printStatus();
        iran.printStatus();
        usa.printStatus();

        iran.defend(12000);
        israel.defend(1000);
        usa.defend(3);

        israel.printStatus();
        iran.printStatus();
        usa.printStatus();

        iran.surrender();

        israel.printStatus();
        iran.printStatus();
        usa.printStatus();
    }
}
