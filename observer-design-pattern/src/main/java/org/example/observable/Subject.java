package org.example.observable;

import org.example.observer.Observer;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
  void setData(int data);
  String getData();
}
