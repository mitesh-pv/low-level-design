package org.example.strategy;

import java.util.List;
import org.example.entity.parkingspot.ParkingSpot;
import org.example.entity.vehicle.VehicleType;

public class DefaultParkingStrategy implements ParkingStrategy {

  @Override
  public ParkingSpot findFreeSpot(List<ParkingSpot> parkingSpotList) {
    for(ParkingSpot spot: parkingSpotList) {
      if(spot.isEmpty()) return spot;
    }

    return null;
  }
}
