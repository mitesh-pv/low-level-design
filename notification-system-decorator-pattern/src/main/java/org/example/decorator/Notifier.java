package org.example.decorator;

import lombok.Getter;
import org.example.service.DatabaseService;

public class Notifier implements INotifier {
  private DatabaseService databaseService;

  @Getter
  private String username;

  public Notifier(String username) {
    this.databaseService = new DatabaseService();
    this.username = username;
  }

  @Override
  public void send(String message) {
    String email = databaseService.getUserEmail(username);
    System.out.println("Sending Email to " + email);
  }

}
