package prog2.tut4.aufgabe1;

public enum Difficulty {
    T1("Leichte Wanderung"),
    T2("Bergwandern"),
    T3("Anspruchsvolles Bergwandern"),
    T4("Alpinwandern"),
    T5("Schwere Bergtour"),
    T6("Sehr schwere Bergtour");

    private String description;

    Difficulty(String description) {
        this.description = description;
    }
}
