package com.tlglearning.cards.model;

public enum Suit {

  CLUBS('\u2663', Color.BLACK), //becomes public static final Suit CLUBS = new Suit(), ''is for char literals, "" is for string literals
  DIAMONDS('\u2662', Color.RED),
  HEARTS('\u2661', Color.RED),
  SPADES('\u2660', Color.BLACK);

  private final char symbol;
  private final Color color;

  Suit(char symbol, Color color) {
    this.symbol = symbol;
    this.color = color;
  }

  public  char symbol() {
    return symbol;
  }

  public Color color(){
    return color;
  }


  @Override
  public String toString() {
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase();
  }

  public enum Color {
    BLACK, RED;
  }

}
