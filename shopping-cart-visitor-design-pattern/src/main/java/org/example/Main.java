package org.example;

import java.util.ArrayList;
import java.util.List;
import org.example.element.BookElement;
import org.example.element.FruitElement;
import org.example.element.ItemElement;
import org.example.visitor.PricingVisitor;
import org.example.visitor.ShoppingCartVisitor;

public class Main {

  public static void main(String[] args) {
    List<ItemElement> items = new ArrayList<>();
    items.add(new BookElement("ABC", "1A", 99D));
    items.add(new FruitElement("Banana", 20D, 2D));
    items.add(new FruitElement("Oranges", 30D, 9D));
    items.add(new BookElement("PQR", "1B", 120D));

    ShoppingCartVisitor shoppingCartVisitor = new PricingVisitor();
    double totalAmount = 0.0D;
    for(ItemElement element: items) {
      totalAmount += element.accept(shoppingCartVisitor);
    }

    System.out.println("Total Cart Price = " + totalAmount);

  }
}