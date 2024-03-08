package org.example.handler;

import org.example.model.DataSource;

public class PasswordValidationHandler extends Handler {
  private DataSource dataSource;

  public PasswordValidationHandler(DataSource dataSource) {
    this.dataSource = dataSource;
  }
  @Override
  public boolean handle(String username, String password) {
    if(!dataSource.isValidPassword(username, password)) {
      System.err.println("Invalid username or password");
      return false;
    }

    return handleNext(username, password);
  }
}
