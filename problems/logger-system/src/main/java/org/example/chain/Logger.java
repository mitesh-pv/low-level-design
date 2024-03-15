package org.example.chain;

public abstract class Logger {
  public static int INFO = 1;
  public static int DEBUG = 2;
  public static int ERROR = 3;

  protected Logger next;

  protected Logger(Logger next) {
    this.next = next;
  }

  public void log(int logLevel, String message) {
    if(next != null) {
      next.log(logLevel, message);
    }
  }
}
