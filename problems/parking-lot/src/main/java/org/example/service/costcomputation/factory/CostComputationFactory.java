package org.example.service.costcomputation.factory;

import org.example.entity.vehicle.VehicleType;
import org.example.service.costcomputation.CostComputationStrategy;
import org.example.service.costcomputation.FourWheelerCostComputationStrategy;
import org.example.service.costcomputation.TwoWheelerCostComputationStrategy;
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
