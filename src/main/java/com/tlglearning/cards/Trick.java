package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import com.tlglearning.cards.model.Suit.Color;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Trick {

  private final Random rng;
  private final List<Card> blackPile;
  private final List<Card> redPile;

  public Trick(Random rng){
    this.rng = rng;
    Deck deck = new Deck();
    deck.shuffle(rng);
    blackPile = new ArrayList<>();
    redPile = new ArrayList<>();
    divideIntoPiles(deck);
  }

  private void divideIntoPiles(Deck deck) {
    for(Iterator<Card> iterator = deck.iterator(); iterator.hasNext(); ){
      Card indicator = iterator.next();
      Card next = iterator.next();
      if(indicator.suit().color() == Color.BLACK){
        blackPile.add(next);
      }else{
        redPile.add(next);
      }
    }
  }

  public static void main(String[] args) {
    // TODO: 9/28/22 Create and shuffle a deck of cards
    Trick trick = new Trick(new SecureRandom());
    // TODO: 9/28/22 Divide deck into two piles, red and black, discard indicator cards
    trick.swapBetweenPiles();
    // TODO: 9/28/22  Swap a random number of cards(between 0 and the size of the samller pile,inclusive)
    //  between red and balck piles
    // TODO: 9/28/22 Tally the results: Count red cards in red pile, black card in black pile,
    //  compare for equality; also display the contents of the piles.
  }

  private void swapBetweenPiles(){
    int maxSwapCount = Math.min(blackPile.size(), redPile.size());
    int swapCount = rng.nextInt(maxSwapCount+1); //from 0 to maxSwapCount inclusive

    for(int i = 0; i < swapCount; i++){
      redPile.add(blackPile.remove(0));
      blackPile.add(redPile.remove(0));
    }
  }

}
