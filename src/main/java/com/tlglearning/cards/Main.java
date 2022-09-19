package com.tlglearning.cards;

import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    // TODO: 9/19/22 create an instance of Deck
    Deck deck = new Deck();
    // TODO: 9/19/22 print string representation of the Deck
    System.out.println(deck);
    // TODO: 9/19/22 create an acceptable source of randomness
    Random rng = new SecureRandom();
    // TODO: 9/19/22 shuffle the deck, using the created source pf randomness
    deck.shuffle(rng);
    // TODO: 9/19/22 print the string representation of the deck after shuffling
    System.out.println(deck);
  }
}
