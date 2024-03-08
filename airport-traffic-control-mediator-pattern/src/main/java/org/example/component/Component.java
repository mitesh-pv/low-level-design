package org.example.component;

import org.example.mediator.Mediator;

public interface Component {
  void setMediator(Mediator mediator);
  void requestTakeOff();
  void requestLanding();
  String getName();
  void receiveNotification(String message);
}
