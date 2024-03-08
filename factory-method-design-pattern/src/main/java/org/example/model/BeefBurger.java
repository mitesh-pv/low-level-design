package org.example.model;

public class BeefBurger implements Burger {

  @Override
  public void prepare() {
    System.out.println("Preparing Beef burger...");
  }
}
