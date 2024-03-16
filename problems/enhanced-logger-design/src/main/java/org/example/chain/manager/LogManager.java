package org.example.chain.manager;

import java.util.logging.Logger;
import org.example.chain.DebugLogProcessor;
import org.example.chain.ErrorLogProcessor;
import org.example.chain.InfoLogProcessor;
import org.example.chain.LogProcessor;
import org.example.listener.LogSubject;
import org.example.observer.ConsoleLogObserver;
import org.example.observer.FileLogObserver;
import org.example.observer.LogObserver;

public class LogManager {

  /**
   * returns LogProcessor, the chain pattern which the logging will follow
   * @return
   */
  public static LogProcessor getLogProcessor() {
    LogProcessor logProcessor = new InfoLogProcessor(1,
        new DebugLogProcessor(2, new ErrorLogProcessor(3, null)));
    return logProcessor;
  }

  /**
   * return LogSink where the log is directed
   * @return
   */
  public static LogSubject getLogSubject() {
    LogObserver fileObserver = new FileLogObserver();
    LogObserver consoleObserver = new ConsoleLogObserver();

    LogSubject logSubject = new LogSubject();
    logSubject.addObserver(1, fileObserver);

    logSubject.addObserver(2, consoleObserver);

    logSubject.addObserver(3, fileObserver);
    logSubject.addObserver(3, consoleObserver);

    return logSubject;
  }

}
