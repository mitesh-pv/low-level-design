package org.example.decorator;

import org.example.service.DatabaseService;

public abstract class BaseDecorator implements INotifier {
  protected INotifier wrapper;
  protected DatabaseService databaseService;

  public BaseDecorator(INotifier wrapper) {
    this.wrapper = wrapper;
    this.databaseService = new DatabaseService();
  }

  @Override
  public void send(String message) {
    wrapper.send(message);
  }

  public String getUsername() {
    return wrapper.getUsername();
  }
}
