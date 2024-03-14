package org.example.service.pricing;

import org.example.entity.Ticket;

public class PerMinutePricingStrategy implements PricingStrategy {
  private final double UNIT_CHARGE = 5D;

  @Override
  public double computePrice(Ticket ticket) {
    double totalTimeInHours =
        (double) (System.currentTimeMillis() - ticket.getEntryTimeInMillis()) / (1000 * 60);
    return totalTimeInHours * UNIT_CHARGE;
  }
}
