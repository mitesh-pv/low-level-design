package org.example.service;

import org.example.model.BeefBurger;
import org.example.model.Burger;

public class BeefBurgerRestraunt extends Restraunt {

  @Override
  protected Burger createBurger() {
    return new BeefBurger();
  }
}
