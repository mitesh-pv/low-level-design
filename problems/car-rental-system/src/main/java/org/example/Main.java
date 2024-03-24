package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.example.manager.CarInventoryManager;
import org.example.manager.VehicleInventoryManager;
import org.example.manager.VehicleRentalController;
import org.example.model.Bill;
import org.example.model.Booking;
import org.example.model.BookingStatus;
import org.example.model.Car;
import org.example.model.Location;
import org.example.model.Status;
import org.example.model.Store;
import org.example.model.User;
import org.example.model.Vehicle;
import org.example.model.VehicleType;
import org.example.service.PaymentService;
import org.example.strategy.CardPaymentStrategy;

public class Main {

  public static void main(String[] args) {
    // Add inventory
    List<Vehicle> cars = addCarInventory();
    VehicleInventoryManager bangaloreCarInventory = new CarInventoryManager(cars);
    VehicleInventoryManager mumbaiCarInventory = new CarInventoryManager(new ArrayList<>(cars));

    // Populate stores
    VehicleRentalController vehicleRentalController = new VehicleRentalController();
    populateStores(vehicleRentalController, bangaloreCarInventory, mumbaiCarInventory);
    addUser(vehicleRentalController);

    // pick a store
    List<Store> bangaloreStores = vehicleRentalController.getStoresByLocation("Bangalore");
    System.out.println("Stores in Bangalore = " + bangaloreStores);
    Store store = bangaloreStores.get(0);

    // Get List of Available Cars
    List<Vehicle> availableCars = store.getListOfVehicles(VehicleType.CAR);

    Location pickupLocation = new Location(111L, "Bangalore",
        "Karnataka", new double[]{1d, 1d});

    // Book a Vehicle
    Vehicle vehicle = availableCars.get(0);
    PaymentService paymentService = new PaymentService(
        new CardPaymentStrategy(12344, "Mitesh", "4465"));

    Booking booking = new Booking(1L, vehicleRentalController.getUsers().get(0),
        vehicle, 12344L, pickupLocation, pickupLocation);

    booking.scheduleBooking(123455L, 679009L, paymentService);
    vehicle.setKmDriven(vehicle.getKmDriven() + 400);

    booking.completeBooking();
    System.out.println(booking);
  }

  private static List<Vehicle> addCarInventory() {
    Vehicle car1 = new Car(1L, 20000, Status.ACTIVE, "Honda", "City");
    Vehicle car2 = new Car(2L, 10000, Status.INACTIVE, "Honda", "Amaze");

    return Arrays.asList(car1, car2);
  }

  private static void populateStores(VehicleRentalController vehicleRentalController,
      VehicleInventoryManager bangaloreCarInventory, VehicleInventoryManager mumbaiCarInventory) {

    Location location1 = new Location(111L, "Bangalore",
        "Karnataka", new double[]{1d, 1d});

    Store store1 = new Store(11L, location1);
    vehicleRentalController.addStore(store1);
    store1.addInventoryManager(VehicleType.CAR, bangaloreCarInventory);

    Location location2 = new Location(112L, "Mumbai",
        "Maharashtra", new double[]{2d, 2d});

    Store store2 = new Store(12L, location2);
    vehicleRentalController.addStore(store2);
    store1.addInventoryManager(VehicleType.CAR, mumbaiCarInventory);
  }

  private static void addUser(VehicleRentalController vehicleRentalController) {
    User user1 = new User("John", "123");
    vehicleRentalController.addUser(user1);
    User user2 = new User("Peter", "456");
    vehicleRentalController.addUser(user2);
  }
}