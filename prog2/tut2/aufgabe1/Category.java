package prog2.tut2.aufgabe1;

public enum Category {

    GREEN("green", "Sprint rating"),
    DOTTED("dotted", "Mountain rating"),
    YELLOW("yellow", "General classification");

    private String name;
    private String description;
    Category(String name, String description) {}

}
