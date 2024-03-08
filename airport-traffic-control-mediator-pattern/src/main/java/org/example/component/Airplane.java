package org.example.component;

import org.example.mediator.Mediator;

public class Airplane implements Component {
  private Mediator mediator;
  private String name;

  public Airplane(String name) {
    this.name = name;
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
    mediator.addComponent(this);
  }

  @Override
  public void requestTakeOff() {
    mediator.requestTakeOff(this);
  }

  @Override
  public void requestLanding() {
    mediator.requestLanding(this);
  }

  @Override
  public void receiveNotification(String message) {
    System.out.println(message);
  }

  @Override
  public String getName() {
    return this.name;
  }
}
