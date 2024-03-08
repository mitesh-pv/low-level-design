package org.example.sender;

import org.example.command.Command;

public class Controller {
  private Command moveUp;
  private Command moveDown;
  private Command moveLeft;
  private Command moveRight;

  public Controller(Command moveUp, Command moveDown, Command moveLeft, Command moveRight) {
    this.moveUp = moveUp;
    this.moveDown = moveDown;
    this.moveLeft = moveLeft;
    this.moveRight = moveRight;
  }

  public void moveUp() {
    moveUp.execute();
  }

  public void moveDown() {
     moveDown.execute();
  }

  public void moveLeft() {
    moveLeft.execute();
  }

  public void moveRight() {
    moveRight.execute();
  }
}
