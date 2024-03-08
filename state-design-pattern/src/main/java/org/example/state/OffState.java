package org.example.state;

import org.example.context.Phone;

public class OffState extends State {

  public OffState(Phone phone) {
    super(phone);
  }

  @Override
  public void onHome() {
    phone.setState(new LockedState(phone));
    System.out.println(phone.unlock());
    System.out.println(phone.lock());
  }

  @Override
  public void onPowerOnOff() {
    phone.setState(new LockedState(phone));
    System.out.println(phone.unlock());
    System.out.println(phone.lock());
  }
}
