package org.example.decorator;

import org.example.component.PizzaBase;

public class MushroomDecorator extends ToppingsDecorator {

  public MushroomDecorator(PizzaBase wrapper) {
    super(wrapper);
  }

  @Override
  public int calculateCost() {
    int cost = super.calculateCost();
    System.out.println("Mushroom Toppings = " + 40);
    return cost + 40;
  }
}
