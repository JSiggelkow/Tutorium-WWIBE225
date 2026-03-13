package tut6.aufgabe1;

public enum Sportart {
    FUSSBALL("Fußball", true),
    TENNIS("Tennis", false),
    BOXEN("Boxen", false),
    SCHACH("Schach", false),
    BEACHVOLLEYBALL("Beachvolleyball", true);

    private final String description;
    private final boolean isTeamSport;

    Sportart(String description, boolean isTeamSport) {
        this.description = description;
        this.isTeamSport = isTeamSport;
    }

    public String getDescription() {
        return description;
    }

    public boolean isTeamSport() {
        return isTeamSport;
    }

    @Override
    public String toString() {
        return "Sportart{" +
                "description='" + description + '\'' +
                ", isTeamSport=" + isTeamSport +
                '}';
    }
}
