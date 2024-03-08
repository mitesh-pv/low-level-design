package org.example.component;

import org.example.mediator.Mediator;

public interface Component {

  void placeBid(double amount);

  void setMediator(Mediator mediator);

  void receiveNotification(String message);

  String getName();
}
