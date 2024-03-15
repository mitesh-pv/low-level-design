package org.example.service.entryexit;

import java.util.Map;
import lombok.Data;
import org.example.entity.vehicle.VehicleType;
import org.example.service.parkingmanager.ParkingSpotManager;
import org.example.service.parkingmanager.factory.ParkingSpotManagerFactory;

@Data
public class EntranceController {
  private ParkingSpotManagerFactory parkingSpotManagerFactory;
  private Map<VehicleType, ParkingSpotManager> parkingSpotManagerMap;

  public EntranceController() {

  }

  public void findParkingSpot() {

  }

  public void bookParkingSpot() {

  }

  public void generateParkingSpot() {

  }

}
