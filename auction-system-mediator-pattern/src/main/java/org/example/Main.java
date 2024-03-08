package org.example;

import org.example.component.Bidder;
import org.example.component.Component;
import org.example.mediator.AuctionMediator;
import org.example.mediator.Mediator;

public class Main {

  public static void main(String[] args) {
    Mediator auctionMediator = new AuctionMediator();

    Component bidder1 = new Bidder("Bidder A");
    bidder1.setMediator(auctionMediator);

    Component bidder2 = new Bidder("Bidder B");
    bidder2.setMediator(auctionMediator);

    bidder2.placeBid(2000D);

    bidder1.placeBid(4000D);

  }
}