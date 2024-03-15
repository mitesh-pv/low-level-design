package org.example.strategy.parking;

import java.util.List;
import org.example.entity.parkingspot.ParkingSpot;
import org.example.entity.vehicle.VehicleType;

public interface ParkingStrategy {
  ParkingSpot findFreeSpot(List<ParkingSpot> parkingSpotList);
}
