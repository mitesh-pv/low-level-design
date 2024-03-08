package org.example.command;

import org.example.receiver.Player;

public class MoveRightCommand implements Command {
  private Player player;

  public MoveRightCommand(Player player) {
    this.player = player;
  }

  @Override
  public void execute() {
    player.moveRight();
  }
}
