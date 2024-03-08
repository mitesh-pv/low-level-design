package org.example;

import org.example.command.Command;
import org.example.command.MoveDownCommand;
import org.example.command.MoveLeftCommand;
import org.example.command.MoveRightCommand;
import org.example.command.MoveUpCommand;
import org.example.receiver.Player;
import org.example.sender.Controller;

public class Main {

  public static void main(String[] args) {

    Player player = new Player("");

    Command upCommand = new MoveUpCommand(player);
    Command downCommand = new MoveDownCommand(player);
    Command leftCommand = new MoveLeftCommand(player);
    Command rightCommand = new MoveRightCommand(player);

    Controller sender = new Controller(upCommand, downCommand, leftCommand, rightCommand);
    sender.moveUp();
    sender.moveDown();
    sender.moveLeft();
    sender.moveRight();
  }
}