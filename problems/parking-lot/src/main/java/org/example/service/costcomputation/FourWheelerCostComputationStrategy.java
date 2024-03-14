package org.example.service.costcomputation;

import org.example.entity.Ticket;
import org.example.service.pricing.PricingStrategy;

public class FourWheelerCostComputationStrategy extends CostComputationStrategy {

  public FourWheelerCostComputationStrategy(
      PricingStrategy pricingStrategy) {
    super(pricingStrategy);
  }

  @Override
  public double computeCost(Ticket ticket) {
    return pricingStrategy.computePrice(ticket);
  }
}
