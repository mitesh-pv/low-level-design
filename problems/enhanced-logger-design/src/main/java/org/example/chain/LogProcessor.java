package org.example.chain;

import org.example.listener.LogSubject;

public abstract class LogProcessor {
  protected int logLevel;
  protected LogProcessor next;

  public LogProcessor(int logLevel, LogProcessor next) {
    this.logLevel = logLevel;
    this.next = next;
  }

  public abstract void log(int logLevel, String message, LogSubject logSubject);

}
