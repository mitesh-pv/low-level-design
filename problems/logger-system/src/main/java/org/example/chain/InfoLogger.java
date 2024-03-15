package org.example.chain;

public class InfoLogger extends Logger {

  public InfoLogger(Logger next) {
    super(next);
  }

  @Override
  public void log(int logLevel, String message) {
    if(logLevel == INFO) {
      System.out.println("INFO: " + message);
    } else {
      next.log(logLevel, message);
    }
  }
}
