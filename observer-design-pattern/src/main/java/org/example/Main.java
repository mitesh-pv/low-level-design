package org.example;

import org.example.observable.IPhoneObservable;
import org.example.observable.Subject;
import org.example.observer.EmailObserver;
import org.example.observer.Observer;

public class Main {

  public static void main(String[] args) {
    Subject observable = new IPhoneObservable("IPhone 14");

    Observer emailObserver = new EmailObserver("abc@gmail.com", observable);
    observable.setData(10);
  }
}