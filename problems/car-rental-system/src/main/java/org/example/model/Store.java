package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.example.manager.VehicleInventoryManager;

@Getter
@Setter
public class Store {
  private long id;
  private List<Vehicle> vehicleList;
  private List<Booking> bookings;
  private Location location;
  private Map<VehicleType, VehicleInventoryManager> inventoryManagerMap;

  public Store(long id, Location location) {
    this.id = id;
    this.vehicleList = new ArrayList<>();
    this.bookings = new ArrayList<>();
    this.location = location;
    inventoryManagerMap = new HashMap<>();
  }

  public void addInventoryManager(VehicleType vehicleType,
      VehicleInventoryManager vehicleInventoryManager) {

    inventoryManagerMap.put(vehicleType, vehicleInventoryManager);
  }

  public List<Vehicle> getListOfVehicles(VehicleType vehicleType) {
    List<Vehicle> availableVehicles = new ArrayList<>();

    inventoryManagerMap.get(vehicleType).getVehicleList().stream().forEach(vehicle -> {
      if(vehicle.getStatus() == Status.ACTIVE) {
        availableVehicles.add(vehicle);
      }
    });

    return availableVehicles;
  }

}
