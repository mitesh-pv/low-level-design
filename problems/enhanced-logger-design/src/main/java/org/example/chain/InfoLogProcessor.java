package org.example.chain;

import org.example.listener.LogSubject;

public class InfoLogProcessor extends LogProcessor {

  public InfoLogProcessor(int logLevel, LogProcessor next) {
    super(logLevel, next);
  }

  @Override
  public void log(int logLevel, String message, LogSubject logSubject) {
    if (this.logLevel == logLevel) {
      String logMessage = "INFO: " + message;
      logSubject.notifyAllObserver(logLevel, logMessage);
      return;
    }

    if(null != next) next.log(logLevel, message, logSubject);
  }
}
