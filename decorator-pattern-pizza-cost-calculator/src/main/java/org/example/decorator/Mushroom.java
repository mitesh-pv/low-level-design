package org.example.decorator;

import org.example.component.BasePizza;

public class Mushroom extends ToppingsDecorator {

  public Mushroom(BasePizza pizza) {
    super(pizza);
  }
  @Override
  public int cost() {
    System.out.println("Added mushroom topping");
    return this.pizza.cost() + 20;
  }
}
