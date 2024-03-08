package org.example;

import org.example.command.Command;
import org.example.command.SwitchLightCommand;
import org.example.receiver.Light;
import org.example.sender.LivingRoom;
import org.example.sender.Room;

public class Main {

  public static void main(String[] args) {
    Room livingRoom = new LivingRoom();
    Light light = new Light();
    Command switchLightCommand = new SwitchLightCommand(light);
    livingRoom.setCommand(switchLightCommand);

    livingRoom.executeCommand();
    livingRoom.executeCommand();
  }
}