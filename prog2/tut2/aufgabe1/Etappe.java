package prog2.tut2.aufgabe1;

public class Etappe {
    private String number;
    private int distance;
    private int heightMeters;

    public Etappe(String number, int distance, int heightMeters) {
        this.number = number;
        this.distance = distance;
        this.heightMeters = heightMeters;
    }

    /*
    Lombok:
    @Getter
    @Setter
     */

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getHeightMeters() {
        return heightMeters;
    }

    public void setHeightMeters(int heightMeters) {
        this.heightMeters = heightMeters;
    }

    public void rate(Cyclist cyclist, int rank, Category category) {
        if (rank < 25) {
            switch(category) {
                case GREEN -> cyclist.addPointsGreen(25 - rank);
                case DOTTED -> cyclist.addPointsDotted(25 - rank);
                case YELLOW -> cyclist.addPointsGeneral(25 - rank);
            }
        }
    }

}
