package org.example.decorator;

import org.example.service.DatabaseService;

public class WhatsappDecorator extends BaseDecorator {

  public WhatsappDecorator(INotifier wrapper) {
    super(wrapper);
  }

  @Override
  public void send(String message) {
    super.send(message);

    String waContact = databaseService.getPhoneFromUser(getUsername());
    System.out.println("Whatsapp notification sent to " + waContact);
  }
}
