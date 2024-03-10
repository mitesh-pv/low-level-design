package org.example.decorator;

import org.example.component.BasePizza;

public class ExtraCheese extends ToppingsDecorator {

  public ExtraCheese(BasePizza pizza) {
    super(pizza);
  }

  @Override
  public int cost() {
    System.out.println("Added extra cheese topping");
    return this.pizza.cost() + 20;
  }
}
