package org.example.observer;

public class ConsoleLogObserver implements LogObserver {

  @Override
  public void log(String message) {
    System.out.println("CONSOLE: " + message);
  }
}
