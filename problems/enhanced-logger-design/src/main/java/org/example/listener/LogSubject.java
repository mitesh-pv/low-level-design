package org.example.listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.observer.LogObserver;

public class LogSubject {
  private Map<Integer, List<LogObserver>> logListeners;

  public LogSubject() {
    this.logListeners = new HashMap<>();
  }

  public void addObserver(int logLevel, LogObserver logObserver) {
    List<LogObserver> observerList = logListeners.getOrDefault(logLevel, new ArrayList<>());
    observerList.add(logObserver);

    logListeners.put(logLevel, observerList);
  }

  public void notifyAllObserver(int logLevel, String message) {
    logListeners.get(logLevel).forEach(logObserver -> logObserver.log(message));
  }

}
