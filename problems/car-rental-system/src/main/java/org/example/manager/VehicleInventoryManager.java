package org.example.manager;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.example.model.Vehicle;

@Getter
@Setter
public class VehicleInventoryManager {
  protected List<Vehicle> vehicleList;

  public VehicleInventoryManager(List<Vehicle> vehicleList) {
    this.vehicleList = new ArrayList<>();
    this.vehicleList.addAll(vehicleList);
  }
}
