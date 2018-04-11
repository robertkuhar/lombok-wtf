package org.rekdev.lombokwtf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CardTests {
  @Test
  public void testCards() throws Exception {
    Card queenOfSpades0 = new Card(Card.Suit.SPADES, Card.Rank.QUEEN);
    Card queenOfSpades1 = new Card(Card.Suit.SPADES, Card.Rank.QUEEN);
    Card queenOfHearts = new Card(Card.Suit.HEARTS, Card.Rank.QUEEN);
    assertEquals(queenOfSpades0, queenOfSpades1);
    assertEquals(queenOfSpades0.hashCode(), queenOfSpades1.hashCode());
    assertNotEquals(queenOfHearts, queenOfSpades0);
    assertNotEquals(queenOfHearts.hashCode(), queenOfSpades0.hashCode());
  }
}
