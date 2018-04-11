package org.rekdev.lombokwtf;

import java.sql.Date;
import java.time.Instant;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World.");
    Instant july_18_1964 = Instant.parse("1964-07-18T00:00:00.000Z");

    Person robertKuhar = new Person("Robert", "Kuhar", Date.from(july_18_1964));
    System.out.printf("robertkuhar: %s\n", robertKuhar);

    Card queenOfHearts = new Card(Card.Suit.HEARTS, Card.Rank.QUEEN);
    System.out.printf("queenOfHearts: %s, isFaceCard=%s\n", queenOfHearts, queenOfHearts.getRank().isFaceCard());
  }
}
