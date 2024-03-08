package org.example.command;

import org.example.receiver.Light;

public class SwitchLightCommand implements Command {
  private Light light; // receiver

  public SwitchLightCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    this.light.switchLight();
  }
}
