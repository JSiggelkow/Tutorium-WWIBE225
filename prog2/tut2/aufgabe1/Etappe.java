package prog2.tut2.aufgabe1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.function.Predicate;

@Getter
@Setter
@ToString
public class Etappe {
    private String number;
    private int distance;
    private int heightMeters;

    public Etappe(String number, int distance, int heightMeters) {
        this.number = number;
        this.distance = distance;
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
