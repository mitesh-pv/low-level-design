package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.service.PaymentService;
import org.example.strategy.PaymentStrategy;

@Setter
@Getter
@ToString
public class Booking {
  private long id;
  private User user;
  private Vehicle vehicle;
  private long bookingDateTime;
  private long pickupDateTime;
  private long dropDateTime;
  private Location pickupLocation;
  private Location dropLocation;
  private Bill bill;
  private BookingStatus bookingStatus;
  private long startKm;

  public Booking(long id, User user, Vehicle vehicle, long bookingDateTime, Location pickupLocation, Location dropLocation) {
    this.id = id;
    this.user = user;
    this.vehicle = vehicle;
    this.bookingDateTime = bookingDateTime;
    this.pickupLocation = pickupLocation;
    this.dropLocation = dropLocation;
    this.bookingStatus = BookingStatus.PLANNING;
  }

  public void scheduleBooking(long pickupDateTime, long dropDateTime, PaymentService paymentService) {
    this.setPickupDateTime(pickupDateTime);
    this.setDropDateTime(dropDateTime);
    this.bookingStatus = BookingStatus.SCHEDULED;
    this.bill = new Bill(1L, vehicle.getKmDriven(), 2500D, false, paymentService);
    bill.setStartKm(vehicle.getKmDriven());
  }

  public void completeBooking() {
    bill.calculateAmount(vehicle);
    bill.payAmount();
    this.bookingStatus = BookingStatus.COMPLETED;
  }

}
