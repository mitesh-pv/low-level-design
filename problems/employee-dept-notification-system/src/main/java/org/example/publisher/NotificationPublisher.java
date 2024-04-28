package org.example.publisher;

public interface NotificationPublisher {
  void sendNotification(String message);
  void receiveNotification(String message);
  default void subscribe(NotificationPublisher subscriber) {
    System.out.println("This publisher is is of non-subscribe type");
  }
  default void  unsubscribe(NotificationPublisher subscriber) {
    System.out.println("This publisher is is of non-subscribe type");
  }
}
