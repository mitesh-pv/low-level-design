package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.parkingspot.ParkingSpot;
import org.example.entity.vehicle.Vehicle;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
  private String id;
  private Vehicle vehicle;
  private long entryTimeInMillis;
  private ParkingSpot parkingSpot;
}
