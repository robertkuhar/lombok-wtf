package org.rekdev.lombokwtf;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Card {
  enum Suit {CLUBS, DIAMONDS, SPADES, HEARTS}

  enum Rank {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5),
    SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(11), QUEEN(12), KING(13);

    @Getter
    private final int value;

    Rank(int value) {
      this.value = value;
    }

    public boolean isFaceCard() {
      return this == JACK || this == QUEEN || this == KING;
    }

  }

  @Getter
  @NonNull
  private Suit suit;

  @Getter
  @NonNull
  private Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }


}
