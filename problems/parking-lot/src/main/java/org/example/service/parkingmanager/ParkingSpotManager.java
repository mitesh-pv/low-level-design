package org.example.service.parkingmanager;

import java.util.Arrays;
import java.util.List;
import lombok.Data;
import org.example.entity.parkingspot.ParkingSpot;
import org.example.entity.vehicle.Vehicle;
import org.example.strategy.parking.ParkingStrategy;

@Data
public class ParkingSpotManager {
  private List<ParkingSpot> parkingSpotList;
  private ParkingStrategy parkingStrategy;

  public ParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
    this.parkingSpotList = parkingSpotList;
    this.parkingStrategy = parkingStrategy;
  }

  public ParkingSpot findFreeSpot() {
    return parkingStrategy.findFreeSpot(this.parkingSpotList);
  }

  public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
    try {
      parkingSpot.parkVehicle(vehicle);
    } catch (Exception exp) {
      System.err.println("Unable to park vehicle " + Arrays.toString(exp.getStackTrace()));
    }
  }

  public void unParkVehicle(ParkingSpot parkingSpot) {
    try {
      parkingSpot.removeVehicle();
    } catch (Exception exp) {
      System.err.println("Unable to unpark vehicle " + Arrays.toString(exp.getStackTrace()));
    }
  }

  public void addParkingSpots(ParkingSpot parkingSpot) {

  }

  public void removeParkingSpot(ParkingSpot parkingSpot) {

  }

}
