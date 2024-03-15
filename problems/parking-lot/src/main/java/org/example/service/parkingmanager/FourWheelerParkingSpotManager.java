package org.example.service.parkingmanager;

import java.util.List;
import org.example.entity.parkingspot.ParkingSpot;
import org.example.strategy.parking.ParkingStrategy;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
  public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList,
      ParkingStrategy parkingStrategy) {
    super(parkingSpotList, parkingStrategy);
  }
}
