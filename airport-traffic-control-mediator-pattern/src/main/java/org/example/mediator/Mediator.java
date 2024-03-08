package org.example.mediator;

import org.example.component.Component;

public interface Mediator {
  void requestTakeOff(Component component);
  void requestLanding(Component component);
  void addComponent(Component component);
}
