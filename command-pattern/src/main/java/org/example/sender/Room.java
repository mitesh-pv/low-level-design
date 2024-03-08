package org.example.sender;

import org.example.command.Command;

public class Room {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void executeCommand() {
    this.command.execute();
  }

}
