package org.example.receiver;

public class Light {
  private boolean isSwitchOn;

  public void switchLight() {
    this.isSwitchOn = !isSwitchOn;
    System.out.println("Light switch state = " + isSwitchOn);
  }
}
