package org.example;

import org.example.decorator.FBDecorator;
import org.example.decorator.INotifier;
import org.example.decorator.Notifier;
import org.example.decorator.WhatsappDecorator;

public class Main {

  public static void main(String[] args) {
    INotifier notifier = new FBDecorator(
        new WhatsappDecorator(new Notifier("mitesh")));

    notifier.send("New Notification");
  }
}