package org.example.component;

public class Margherita extends BasePizza {

  @Override
  public int cost() {
    System.out.println("Preparing Margherita Base pizza");
    return 100;
  }
}
