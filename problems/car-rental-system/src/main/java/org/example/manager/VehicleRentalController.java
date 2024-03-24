package org.example.manager;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.Location;
import org.example.model.Store;
import org.example.model.User;

@Getter
@Setter
public class VehicleRentalController {
  private List<Store> storeList;
  private List<User> users;

  public VehicleRentalController() {
    this.storeList = new ArrayList<>();
    this.users = new ArrayList<>();
  }

  public List<Store> getStoresByLocation(String city) {
    List<Store> stores = new ArrayList<>();

    for(Store store: storeList) {
      if(store.getLocation().getCity().equals(city)) {
        stores.add(store);
      }
    }

    return stores;
  }

  public void addUser(User user) {
    users.add(user);
  }

  public void addStore(Store store) {
    this.storeList.add(store);
  }

}
