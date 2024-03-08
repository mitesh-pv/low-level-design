package org.example.state;

import org.example.context.Phone;

public class LockedState extends State {

  public LockedState(Phone phone) {
    super(phone);
  }
  @Override
  public void onHome() {
    phone.setState(new ReadyState(phone));
    System.out.println(phone.onHome());
  }

  @Override
  public void onPowerOnOff() {
    phone.setState(new OffState(phone));
    System.out.println(phone.lock());
  }
}
