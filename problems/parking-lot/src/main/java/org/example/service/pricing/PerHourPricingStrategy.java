package org.example.service.pricing;

import org.example.entity.Ticket;

public class PerHourPricingStrategy implements PricingStrategy {
  private final double UNIT_CHARGE  = 20D;

  @Override
  public double computePrice(Ticket ticket) {
    double totalTimeInHours =
        (double) (System.currentTimeMillis() - ticket.getEntryTimeInMillis()) / (1000 * 60 * 60);
    return totalTimeInHours * UNIT_CHARGE;
  }
}
