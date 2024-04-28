package org.example.subscribers;

import java.util.ArrayList;
import java.util.List;
import org.example.publisher.NotificationPublisher;

public class Department implements NotificationPublisher {
  private String departmentName;
  private List<NotificationPublisher> subscribers;
  private CEO ceo;


  public Department(String departmentName, CEO ceo) {
    this.subscribers = new ArrayList<>();
    this.ceo = ceo;
    this.ceo.subscribe(this);
    this.departmentName = departmentName;
  }

  @Override
  public void sendNotification(String message) {
    subscribers.stream().forEach(subscriber -> subscriber.receiveNotification(message));
  }

  @Override
  public void receiveNotification(String message) {
    System.out.println("Department = " + departmentName + " Received message = " + message);
    sendNotification(message);
  }

  @Override
  public void subscribe(NotificationPublisher subscriber) {
    this.subscribers.add(subscriber);
  }

  @Override
  public void unsubscribe(NotificationPublisher subscriber) {
    this.subscribers.remove(subscriber);
  }
}
