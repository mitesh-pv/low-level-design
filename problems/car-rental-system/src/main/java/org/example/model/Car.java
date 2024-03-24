package org.example.model;

public class Car extends Vehicle{
  private String brand;
  private String model;

  public Car(long id, long kmDriven, Status status, String brand, String model) {
    super(id, kmDriven, status);
    this.brand = brand;
    this.model = model;
  }
}
