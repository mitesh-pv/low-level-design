package org.example.visitor;

import org.example.element.BookElement;
import org.example.element.FruitElement;

public abstract class ShoppingCartVisitor {
  public abstract double visit(BookElement bookElement);
  public abstract double visit(FruitElement fruitElement);
}
