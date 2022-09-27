package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    //create an instance of the anonymous class at the same statement, define the class and create instance at the same time
    Comparator<Card> comparator = new Comparator<>() { //inside this {} is hte implemantation of the subclass we are creating

      @Override
      public int compare(Card card1, Card card2) {
        int comparison = card1.suit().color().compareTo(card2.suit().color());
        if(comparison == 0){
          comparison = card1.suit().compareTo(card2.suit());
          if(comparison == 0){
            comparison = -(card1.rank().compareTo(card2.rank())); //so instead of ascending, using descending order
          }
        }
        return comparison;
      }

    };

    Deck deck = new Deck();
    System.out.println(deck);
    // TODO: 9/19/22 create an acceptable source of randomness
    Random rng = new SecureRandom();
    // TODO: 9/19/22 shuffle the deck, using the created source pf randomness
    deck.shuffle(rng);
    // TODO: 9/19/22 print the string representation of the deck after shuffling
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
    deck.sort(comparator);
    System.out.println(deck);
  }

}

