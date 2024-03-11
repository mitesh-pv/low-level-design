package org.example.element;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.visitor.ShoppingCartVisitor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookElement implements ItemElement {
  private String bookCode;
  private String bookName;
  private double price;

  @Override
  public double accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
