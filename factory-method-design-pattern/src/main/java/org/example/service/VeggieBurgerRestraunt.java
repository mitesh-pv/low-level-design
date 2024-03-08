package org.example.service;

import org.example.model.Burger;
import org.example.model.VeggieBurger;

public class VeggieBurgerRestraunt extends Restraunt {

  @Override
  protected Burger createBurger() {
    return new VeggieBurger();
  }
}
