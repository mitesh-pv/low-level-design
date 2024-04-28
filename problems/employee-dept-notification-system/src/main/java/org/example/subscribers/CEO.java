package org.example.subscribers;

import java.util.ArrayList;
import java.util.List;
import org.example.publisher.NotificationPublisher;

public class CEO implements NotificationPublisher {
  private List<NotificationPublisher> subscribers;

  public CEO() {
    subscribers = new ArrayList<>();
  }

  @Override
  public void sendNotification(String message) {
    subscribers.stream().forEach(subscriber -> subscriber.receiveNotification(message));
  }

  @Override
  public void receiveNotification(String message) {
    System.out.println("Received message = " + message);
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
