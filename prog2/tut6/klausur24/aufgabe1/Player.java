package prog2.tut6.klausur24.aufgabe1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Player { // 1.5
	private final String name;
	private final List<Card> handCards;
	private final Map<Card,Integer> playedCards;
	private int actionPoints;

	public Player(String name, List<Card> handCards, Map<Card, Integer> playedCards) { // 1
		this.name = name;
		this.handCards = handCards;
		this.playedCards = playedCards;
	}

	public int getActionPoints() {
		return actionPoints;
	}

	public List<Card> getHandCards() {
		return handCards;
	}

	public String getName() {
		return name;
	}

	public Map<Card, Integer> getPlayedCards() {
		return playedCards;
	}

	public void setActionsPoints(int actionPoints) {
		this.actionPoints = actionPoints;
	}

	public Optional<Card> getMostPowerfulCardByRow(int row) { // 1
		return playedCards.entrySet() // 1
				.stream() // 1
				.filter(e -> e.getValue() == row) // 1
				.map(Map.Entry::getKey) // 1.5
				.max(Comparator.comparing(Card::power)); //1.5
	}

	public void playCard(Card card, int row) throws CardNotFoundException, NotEnoughActionPointsException { // 2.5
		if (!handCards.contains(card)) { //0.5
			throw new CardNotFoundException(); //1
		}
		if (card.costs() > actionPoints) { //0.5
			throw new NotEnoughActionPointsException(); // 1
		}
		actionPoints -= card.costs(); // 1
		playedCards.put(card, row); // 1
		handCards.remove(card); // 1
	}
}
