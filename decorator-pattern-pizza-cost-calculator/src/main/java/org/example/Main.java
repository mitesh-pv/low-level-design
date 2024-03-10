package org.example;

import org.example.component.BasePizza;
import org.example.component.Margherita;
import org.example.decorator.ExtraCheese;
import org.example.decorator.Mushroom;

public class Main {

  public static void main(String[] args) {
    BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));

    System.out.println(pizza.cost());
  }
}