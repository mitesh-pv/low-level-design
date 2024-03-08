package org.example;

import org.example.model.Burger;
import org.example.service.BeefBurgerRestraunt;
import org.example.service.Restraunt;
import org.example.service.VeggieBurgerRestraunt;

public class Main {

  public static void main(String[] args) {
    Restraunt beefBurgerRestraunt = new BeefBurgerRestraunt();
    Burger beefBurger = beefBurgerRestraunt.orderBurger();


    Restraunt veggieBurgerRestraunt = new VeggieBurgerRestraunt();
    Burger veggieBurger = veggieBurgerRestraunt.orderBurger();
  }
}