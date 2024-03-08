package org.example.mediator;


import java.util.ArrayList;
import java.util.List;
import org.example.component.Component;

public class AuctionMediator implements Mediator {
  private List<Component> bidders;

  public AuctionMediator() {
    this.bidders = new ArrayList<>();
  }

  @Override
  public void addBidder(Component component) {
    bidders.add(component);
  }

  @Override
  public void placeBid(Component component, double amount) {
    String message = "Bid received by " + component.getName() + " for amount " + amount;

    for(Component c: bidders) {
      if(!c.getName().equals(component.getName())) {
        c.receiveNotification(message);
      }
    }
  }
}
