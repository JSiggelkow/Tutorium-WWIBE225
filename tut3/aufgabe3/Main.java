package tut3.aufgabe3;

public class Main {
    public static void main(String[] args) {
        Cinema dieBurg = new Cinema("Die Burg");

        Movie daysOfGlory = new Movie("Days of Glory", 1944);
        Movie mobyDick =  new Movie("Moby Dick", 1956);

        Actor gregory = new Actor("Gregory Peck", 109);
        Actor tamara = new Actor("Tamara Toumanova", 106);
        Actor richard = new Actor("Richard Basehart", 110);

        daysOfGlory.addActor(gregory);
        daysOfGlory.addActor(tamara);

        mobyDick.addActor(gregory);
        mobyDick.addActor(richard);

        dieBurg.addMovie(daysOfGlory);
        dieBurg.addMovie(mobyDick);

        dieBurg.printProgram();

        daysOfGlory.getOldestActor().printInfo();
        mobyDick.getOldestActor().printInfo();
    }
}
