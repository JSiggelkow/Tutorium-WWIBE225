package tut3.aufgabe1;

public class Main {
    public static void main(String[] args) {
        Formular f1 = new Formular(1.3, 3.6, 8);
        Formular f2 = new Formular(2.6, 4.9, 10);
        Formular f3 = new Formular(2.0, 2.7, 3);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
    }
}
