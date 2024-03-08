package org.example.state;

import org.example.context.Phone;

public class ReadyState extends State {

  public ReadyState(Phone phone) {
    super(phone);
  }

  @Override
  public void onHome() {
    // Do Nothing - already in home
    System.out.println(phone.onHome());
  }

  @Override
  public void onPowerOnOff() {
    phone.setState(new OffState(phone));
    System.out.println(phone.lock());
  }
}
