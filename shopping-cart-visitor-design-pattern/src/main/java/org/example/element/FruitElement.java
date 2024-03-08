package org.example.element;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.visitor.ShoppingCartVisitor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FruitElement implements ItemElement {
  private String name;
  private double unitPrice;
  private double weight;

  @Override
  public double accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
