package org.example.manager;

import java.util.List;
import org.example.model.Car;
import org.example.model.Vehicle;

public class CarInventoryManager extends VehicleInventoryManager {

  public CarInventoryManager(List<Vehicle> vehicleList) {
    super(vehicleList);
  }

  public void addNewCar(Car vehicle) {
    this.vehicleList.add(vehicle);
  }

}
