package tut2.aufgabe2;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<>();
    }
    public void addPlayer(Player p) {
        players.add(p);
    }
    public void printTopScorer() {
        Player topScorer = players.get(0);
        for (Player p : players) {
            if (p.getGoals() > topScorer.getGoals()) {
                topScorer = p;
            }
        }
        System.out.println(topScorer.getName() + ", Tore: " + topScorer.getGoals());
    }
}