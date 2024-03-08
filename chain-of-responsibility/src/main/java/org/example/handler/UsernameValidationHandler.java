package org.example.handler;

import org.example.model.DataSource;

public class UsernameValidationHandler extends Handler{
  private DataSource dataSource;

  public UsernameValidationHandler(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public boolean handle(String username, String password) {
    if(!dataSource.isValidUser(username)) {
      System.err.println("Username not registered. Please signup first");
      return false;
    }

    return handleNext(username, password);
  }
}
