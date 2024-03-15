package org.example.strategy.costcomputation;

import org.example.entity.Ticket;
import org.example.service.pricing.PricingStrategy;
import org.example.strategy.costcomputation.CostComputationStrategy;

public class TwoWheelerCostComputationStrategy extends CostComputationStrategy {

  public TwoWheelerCostComputationStrategy(PricingStrategy pricingStrategy) {
    super(pricingStrategy);
  }

  @Override
  public double computeCost(Ticket ticket) {
    return pricingStrategy.computePrice(ticket);
  }
}
