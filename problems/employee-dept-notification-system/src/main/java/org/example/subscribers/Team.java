package org.example.subscribers;

import java.util.ArrayList;
import java.util.List;
import org.example.publisher.NotificationPublisher;

public class Team implements NotificationPublisher {
  private List<NotificationPublisher> subscribers;
  private Department department;
  private String teamName;

  public Team(String teamName, Department department) {
    this.subscribers = new ArrayList<>();
    this.teamName = teamName;
    this.department = department;
    this.department.subscribe(this);
  }

  @Override
  public void sendNotification(String message) {
    subscribers.stream().forEach(subscriber -> subscriber.receiveNotification(message));
  }

  @Override
  public void receiveNotification(String message) {
    System.out.println("Team name = " + teamName + " Received message = " + message + " in the team email");
    // Send it to rest of the team members
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
