package org.example.component;

public class VegDelight extends BasePizza {

  @Override
  public int cost() {
    System.out.println("Preparing VegDelight Base pizza");
    return 200;
  }
}
