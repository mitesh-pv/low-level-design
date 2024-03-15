package org.example.chain;

public class DebugLogger extends Logger {

  public DebugLogger(Logger next) {
    super(next);
  }

  @Override
  public void log(int logLevel, String message) {
    if(logLevel == DEBUG) {
      System.out.println("DEBUG: " + message);
    } else {
      next.log(logLevel, message);
    }
  }
}
