package org.example.service.parkingmanager;

import java.util.List;
import org.example.entity.parkingspot.ParkingSpot;
import org.example.strategy.ParkingStrategy;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {

  public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpotManagerList,
      ParkingStrategy parkingStrategy) {
    super(parkingSpotManagerList, parkingStrategy);
  }
}
