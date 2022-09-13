package com.tlglearning.cards.model;

public enum Suit {

  CLUBS('\u2663'), //becomes public static final Suit CLUBS = new Suit(), ''is for char literals, "" is for string literals
  DIAMONDS('\u2662'), //use unicode here by \u, public static final Suit CLUBS = new Suit('\u2663)
  HEARTS('\u2661'),
  SPADES('\u2660');

  private final char symbol;

  Suit(char symbol) {
    this.symbol = symbol;
  }

  public  char symbol() {
    return symbol;
  }


  @Override
  public String toString() {
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase();
  }

}
