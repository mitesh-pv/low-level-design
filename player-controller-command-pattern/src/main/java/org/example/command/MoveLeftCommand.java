package org.example.command;

import org.example.receiver.Player;

public class MoveLeftCommand implements Command {
  private Player player;

  public MoveLeftCommand(Player player) {
    this.player = player;
  }

  @Override
  public void execute() {
    player.moveLeft();
  }
}
