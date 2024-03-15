package org.example.chain;

public class ErrorLogger extends Logger {

  public ErrorLogger(Logger next) {
    super(next);
  }

  @Override
  public void log(int logLevel, String message) {
    if(logLevel == ERROR) {
      System.err.println("ERROR: " + message);
    } else {
      next.log(logLevel, message);
    }
  }
}
