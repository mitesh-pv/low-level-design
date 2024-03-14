package org.example.entity.parkingspot;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FourWheelerParkingSpot extends ParkingSpot {
  private double price;
}
