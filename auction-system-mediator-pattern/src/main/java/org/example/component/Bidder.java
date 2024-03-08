package org.example.component;

import org.example.mediator.Mediator;

public class Bidder implements Component {
  private Mediator mediator;
  private String name;

  public Bidder(String name) {
    this.name = name;
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
    this.mediator.addBidder(this);
  }

  @Override
  public void placeBid(double amount) {
    mediator.placeBid(this, amount);
  }

  @Override
  public void receiveNotification(String message) {
    System.out.println(message);
  }

  @Override
  public String getName() {
    return this.name;
  }
}
