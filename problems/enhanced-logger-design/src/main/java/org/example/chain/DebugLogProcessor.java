package org.example.chain;

import org.example.listener.LogSubject;

public class DebugLogProcessor extends LogProcessor {

  public DebugLogProcessor(int logLevel, LogProcessor next) {
    super(logLevel, next);
  }

  @Override
  public void log(int logLevel, String message, LogSubject logSubject) {
    if (this.logLevel == logLevel) {
      String logMessage = "DEBUG: " + message;
      logSubject.notifyAllObserver(logLevel, logMessage);
      return;
    }

    if(null != next) next.log(logLevel, message, logSubject);
  }
}
