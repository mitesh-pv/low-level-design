package org.example.strategy.costcomputation.factory;

import org.example.entity.vehicle.VehicleType;
import org.example.strategy.costcomputation.CostComputationStrategy;
import org.example.strategy.costcomputation.FourWheelerCostComputationStrategy;
import org.example.strategy.costcomputation.TwoWheelerCostComputationStrategy;
import org.example.service.pricing.PerHourPricingStrategy;
import org.example.service.pricing.PerMinutePricingStrategy;

public class CostComputationFactory {
  private static CostComputationStrategy costComputationStrategy;

  public static CostComputationStrategy getCostComputationStrategy(VehicleType vehicleType) {
    if(vehicleType == VehicleType.TWO_WHEELER) {
      costComputationStrategy = new TwoWheelerCostComputationStrategy(new PerHourPricingStrategy());
    } else if(vehicleType == VehicleType.FOUR_WHEELER) {
      costComputationStrategy = new FourWheelerCostComputationStrategy(new PerMinutePricingStrategy());
    }

    return costComputationStrategy;
  }

}
