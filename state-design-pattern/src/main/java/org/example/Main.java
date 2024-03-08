package org.example;

import org.example.context.Phone;
import org.example.state.OffState;

public class Main {

  public static void main(String[] args) {
    Phone phone = new Phone();
    phone.setState(new OffState(phone));

    phone.getState().onHome();
    phone.getState().onPowerOnOff();

  }
}