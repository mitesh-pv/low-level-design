package org.example.observer;

public class FileLogObserver implements LogObserver {

  @Override
  public void log(String message) {
    System.out.println("FILE WRITE : " + message);
  }
}
