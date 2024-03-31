package org.example.decorator;

import org.example.component.PanBase;
import org.example.component.PizzaBase;

public abstract class ToppingsDecorator implements PizzaBase {
  private PizzaBase wrapper;

  public ToppingsDecorator(PizzaBase wrapper) {
    this.wrapper = wrapper;
  }

  @Override
  public int calculateCost() {
    return wrapper.calculateCost();
  }
}
