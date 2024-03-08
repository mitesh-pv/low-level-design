package org.example.visitor;

import org.example.element.BookElement;
import org.example.element.FruitElement;

public class PricingVisitor extends ShoppingCartVisitor {

  /**
   * Book Pricing calculator: Apply 5$ discount when unitPrice is >= 100$
   * @param bookElement
   * @return
   */
  @Override
  public double visit(BookElement bookElement) {
    double price = bookElement.getPrice();
    if(price >= 100D) return price - 5;

    return price;
  }

  /**
   * Fruits Pricing calculator: calculate total price unitPrice * weight
   * @param fruitElement
   * @return
   */
  @Override
  public double visit(FruitElement fruitElement) {
    double unitPrice = fruitElement.getUnitPrice();
    return unitPrice * fruitElement.getWeight();
  }
}
