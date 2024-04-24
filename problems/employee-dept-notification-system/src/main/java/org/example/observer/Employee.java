package org.example.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Observer {
  private String empId;
  private String name;
  private boolean isOptOut;

  @Override
  public void notify(String message) {
    System.out.println("Received a notification");
  }
}
