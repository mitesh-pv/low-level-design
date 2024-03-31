package org.example.decorator;

import org.example.service.DatabaseService;

public class FBDecorator extends BaseDecorator {

  public FBDecorator(INotifier wrapper) {
    super(wrapper);
  }

  @Override
  public void send(String message) {
    super.send(message);

    String fbHandle = databaseService.getFBIdFromUser(getUsername());
    System.out.println("Sending FB notification to " + fbHandle);
  }

  @Override
  public String getUsername() {
    return super.getUsername();
  }
}
