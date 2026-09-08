package prog2.tut6.klausur24.aufgabe2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prog2.tut6.klausur24.aufgabe1.Card;
import prog2.tut6.klausur24.aufgabe1.CardNotFoundException;
import prog2.tut6.klausur24.aufgabe1.NotEnoughActionPointsException;
import prog2.tut6.klausur24.aufgabe1.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

	private Player player;
	private Card zombie;
	private Card vampire;

	@BeforeEach
	void setUp() {
		zombie = new Card("Zombie", 3, 4);
		vampire = new Card("Vampire", 6 ,7);
		player = new Player("Hans-Peter", new ArrayList<>(), new HashMap<>());
	}

	@Test
	void testPlayCard() {
		player.getHandCards().add(zombie);

		assertThrows(CardNotFoundException.class, () -> player.playCard(vampire, 1));
		assertThrows(NotEnoughActionPointsException.class, () -> player.playCard(zombie, 1));
	}

	@Test
	void testGetMostPowerfulCardByRow() throws CardNotFoundException, NotEnoughActionPointsException {
		player.setActionsPoints(9);
		player.getHandCards().add(vampire);
		player.getHandCards().add(zombie);

		player.playCard(vampire, 1);
		player.playCard(zombie, 1);

		assertEquals(Optional.of(vampire), player.getMostPowerfulCardByRow(1));
		assertTrue(player.getMostPowerfulCardByRow(2).isEmpty());
	}


}
