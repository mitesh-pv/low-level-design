package org.example.observer;

import org.example.observable.Subject;

public class EmailObserver implements Observer {
  private String id;
  private Subject subject;

  public EmailObserver(String id, Subject subject) {
    this.id = id;
    this.subject = subject;
    subject.registerObserver(this);
  }
  @Override
  public void update() {
    System.out.println("IPhone back in stock current stock for " + subject.getData());
  }
}
