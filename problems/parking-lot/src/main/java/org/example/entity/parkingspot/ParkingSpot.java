package org.example.entity.parkingspot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.vehicle.Vehicle;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpot {
  protected int id;
  protected boolean isEmpty;
  protected Vehicle vehicle;

  public void parkVehicle(Vehicle vehicle) {
    if (!this.isEmpty()) {
      throw new RuntimeException("Parking spot " + this + " is not empty");
    }

    this.setEmpty(true);
    this.setVehicle(vehicle);
  }

  public void removeVehicle() {
    if(this.isEmpty()) {
      throw new RuntimeException("Parking spot " + this + " is already empty");
    }

    this.setEmpty(false);
    this.setVehicle(null);
  }
}
