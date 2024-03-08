package org.example.mediator;

import java.util.ArrayList;
import java.util.List;
import org.example.component.Component;

public class AirTrafficControlMediator implements Mediator {
  private List<Component> airplanes;

  public AirTrafficControlMediator() {
    this.airplanes = new ArrayList<>();
  }

  @Override
  public void addComponent(Component component) {
    this.airplanes.add(component);
  }

  @Override
  public void requestTakeOff(Component component) {
    String message = "Take Off requested by " + component.getName();

    for(Component c: airplanes) {
      if(!c.getName().equals(component.getName())) {
        c.receiveNotification(message);
      }
    }
  }

  @Override
  public void requestLanding(Component component) {
    String message = "Landing requested by " + component.getName();

    for(Component c: airplanes) {
      if(!c.getName().equals(component.getName())) {
        c.receiveNotification(message);
      }
    }
  }
}
