package org.example.element;

import org.example.visitor.ShoppingCartVisitor;

public interface ItemElement {
  double accept(ShoppingCartVisitor visitor);
}
