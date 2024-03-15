package org.example.service.entryexit;

import java.util.Map;
import lombok.Data;
import org.example.entity.vehicle.VehicleType;
import org.example.strategy.costcomputation.CostComputationStrategy;
import org.example.service.parkingmanager.ParkingSpotManager;
import org.example.service.parkingmanager.factory.ParkingSpotManagerFactory;
import org.example.strategy.payment.PaymentStrategy;

@Data
public class ExitController {
  private ParkingSpotManagerFactory parkingSpotManagerFactory;
  private Map<VehicleType, ParkingSpotManager> parkingSpotManagerMap;
  private CostComputationStrategy costComputationStrategy;
  private PaymentStrategy paymentStrategy;

  public ExitController() {

  }

  public void freeParkingSpot() {

  }

  public void calculatePrice() {

  }

  public void processPayment() {

  }

 }
