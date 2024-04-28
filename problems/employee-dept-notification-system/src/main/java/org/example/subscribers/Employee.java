package org.example.subscribers;

import lombok.Setter;
import org.example.publisher.NotificationPublisher;

public class Employee implements NotificationPublisher {
  private Team team;
  private String employeeName;
  @Setter
  private boolean optOut;

  public Employee(Team team, String employeeName) {
    this.team = team;
    this.employeeName = employeeName;
    this.optOut = false;
    team.subscribe(this);
  }

  @Override
  public void sendNotification(String message) {
    team.sendNotification(message);
  }

  @Override
  public void receiveNotification(String message) {
    if (optOut) {
      System.out.println("Employee = " + employeeName + " is out of office");
      return;
    }
    System.out.println("Employee = " + employeeName + " Received message = " + message);
  }

}
