package tut3.aufgabe3;

import java.util.ArrayList;

public class Movie {
    private String title;
    private int year;
    private ArrayList<Actor> actors;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        actors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }
    public void printMovieInfo() {
        System.out.println("Title: " + title + " (" + year + ")\nSchauspieler: \n");
        for (Actor actor : actors) {
            System.out.print("- ");
            actor.printInfo();
        }
    }

    public Actor getOldestActor() {
        Actor tmp = actors.get(0);
        for (Actor actor : actors) {
            if (actor.getAge() > tmp.getAge()) {
                tmp = actor;
            }
        }
        return tmp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
}
