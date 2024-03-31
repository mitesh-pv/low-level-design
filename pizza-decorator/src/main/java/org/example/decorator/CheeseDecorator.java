package org.example.decorator;

import org.example.component.PizzaBase;

public class CheeseDecorator extends ToppingsDecorator {

  public CheeseDecorator(PizzaBase wrapper) {
    super(wrapper);
  }

  @Override
  public int calculateCost() {
    int cost = super.calculateCost();
    System.out.println("Cheese decorator = " + 80);
    return cost + 80;
  }
}
