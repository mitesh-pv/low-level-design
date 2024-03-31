package org.example;

import org.example.component.PanBase;
import org.example.component.PizzaBase;
import org.example.decorator.CheeseDecorator;
import org.example.decorator.MushroomDecorator;

public class Main {

  public static void main(String[] args) {
    PizzaBase pizza = new CheeseDecorator(new MushroomDecorator(new PanBase()));
    System.out.println(pizza.calculateCost());
  }
}