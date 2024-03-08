package org.example;

import org.example.client.AuthServiceClient;
import org.example.handler.Handler;
import org.example.handler.PasswordValidationHandler;
import org.example.handler.RoleCheckHandler;
import org.example.handler.UsernameValidationHandler;
import org.example.model.DataSource;

public class Main {

  public static void main(String[] args) {
    DataSource dataSource = new DataSource();
    Handler usernameValidationHandler = new UsernameValidationHandler(dataSource);
    Handler passwordValidationHandler = new PasswordValidationHandler(dataSource);
    Handler roleCheckHandler = new RoleCheckHandler();

    usernameValidationHandler.setNextHandler(passwordValidationHandler);
    passwordValidationHandler.setNextHandler(roleCheckHandler);

    AuthServiceClient client = new AuthServiceClient(usernameValidationHandler);
    client.login("admin_user", "admin_pas");
  }
}