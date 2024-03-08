package org.example;

import org.example.component.Airplane;
import org.example.component.Component;
import org.example.mediator.AirTrafficControlMediator;
import org.example.mediator.Mediator;

public class Main {

  public static void main(String[] args) {
    Mediator bangaoreAirTrafficMediator = new AirTrafficControlMediator();

    Component airplane1 = new Airplane("Airplane 1");
    Component airplane2 = new Airplane("Airplane 2");

    airplane1.setMediator(bangaoreAirTrafficMediator);
    airplane2.setMediator(bangaoreAirTrafficMediator);

    airplane1.requestLanding();
    airplane2.requestTakeOff();
  }
}