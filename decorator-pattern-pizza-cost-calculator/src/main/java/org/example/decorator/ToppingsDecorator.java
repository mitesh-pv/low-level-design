package org.example.decorator;

import org.example.component.BasePizza;

public abstract class ToppingsDecorator extends BasePizza {
  protected BasePizza pizza;
  public ToppingsDecorator(BasePizza pizza) {
    this.pizza = pizza;
  }
}
