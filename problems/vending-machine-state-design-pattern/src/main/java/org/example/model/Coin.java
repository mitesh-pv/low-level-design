package org.example.model;

public enum Coin {
  ONE(1),
  TWO(2),
  FIVE(5),
  TEN(10),
  TWENTY_FIVE(25);

  public int value;
  Coin(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
}
