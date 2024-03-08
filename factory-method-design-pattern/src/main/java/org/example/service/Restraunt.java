package org.example.service;

import org.example.model.Burger;

public abstract class Restraunt {
  public Burger orderBurger() {
    Burger burger = createBurger();
    burger.prepare();
    return burger;
  }

  protected abstract Burger createBurger();
}
