package org.example.singleton;

import org.example.chain.LogProcessor;
import org.example.chain.manager.LogManager;
import org.example.listener.LogSubject;

/**
 * This Logger class follows Bill Pugh's singleton design pattern
 */
public class Logger {

  private Logger() {}
  private static class SingletonHolder {
    private static Logger logger = new Logger();
    private static LogProcessor logProcessor = LogManager.getLogProcessor();
    private static LogSubject logSubject = LogManager.getLogSubject();
  }

  public static Logger getInstance() {
    return SingletonHolder.logger;
  }

  public void info(String message) {
    invokeLog(1, message, SingletonHolder.logSubject);
  }

  public void debug(String message) {
    invokeLog(2, message, SingletonHolder.logSubject);
  }

  public void error(String message) {
    invokeLog(3, message, SingletonHolder.logSubject);
  }

  private void invokeLog(int logLevel, String message, LogSubject logSubject) {
    SingletonHolder.logProcessor.log(logLevel, message, logSubject);
  }

}
