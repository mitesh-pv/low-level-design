package org.example.receiver;

public class Player {
  private String state;

  public Player(String state) {
    this.state = state;
  }

  public void moveUp() {
    System.out.println(state + " UP");
    state = "UP";
  }

  public void moveDown() {
    System.out.println(state + " DOWN");
    state = "DOWN";
  }

  public void moveLeft() {
    System.out.println(state + " LEFT");
    state = "LEFT";
  }

  public void moveRight() {
    System.out.println(state + " RIGHT");
    state = "RIGHT";
  }
}
