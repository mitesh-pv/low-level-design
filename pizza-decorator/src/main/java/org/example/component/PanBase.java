package org.example.component;

public class PanBase implements PizzaBase {

  @Override
  public int calculateCost() {
    System.out.println("Pan Base Cost = " + 100);
    return 100;
  }
}
