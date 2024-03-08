package org.example.mediator;

import org.example.component.Component;

public interface Mediator {
  void addBidder(Component component);

  void placeBid(Component component, double amount);
}
