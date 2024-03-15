package org.example.service.parkingmanager.factory;

import java.util.List;
import org.example.entity.parkingspot.ParkingSpot;
import org.example.entity.vehicle.VehicleType;
import org.example.service.parkingmanager.FourWheelerParkingSpotManager;
import org.example.service.parkingmanager.ParkingSpotManager;
import org.example.service.parkingmanager.TwoWheelerParkingSpotManager;
import org.example.strategy.parking.ParkingStrategy;

public class ParkingSpotManagerFactory {
  private static ParkingSpotManager parkingSpotManager;

  public static ParkingSpotManager getParkingSpotManager(VehicleType vehicleType,
      List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
    if(vehicleType == VehicleType.TWO_WHEELER) {
      parkingSpotManager = new TwoWheelerParkingSpotManager(parkingSpotList, parkingStrategy);
    } else if(vehicleType == VehicleType.FOUR_WHEELER) {
      parkingSpotManager = new FourWheelerParkingSpotManager(parkingSpotList, parkingStrategy);
    }

    return parkingSpotManager;
  }
}
