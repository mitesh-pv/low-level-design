package org.example.service.costcomputation;

import org.example.entity.Ticket;
import org.example.service.pricing.PricingStrategy;

public abstract class CostComputationStrategy {
  protected PricingStrategy pricingStrategy;

  public CostComputationStrategy(PricingStrategy pricingStrategy) {
    this.pricingStrategy = pricingStrategy;
  }
  public abstract double computeCost(Ticket ticket);
}
