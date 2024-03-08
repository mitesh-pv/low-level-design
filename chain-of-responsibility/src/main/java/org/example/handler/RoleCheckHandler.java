package org.example.handler;

public class RoleCheckHandler extends Handler {

  @Override
  public boolean handle(String username, String password) {
    if("admin_user".equals(username)) {
      System.out.println("Successfully authenticated admin");
      return true;
    }

    return handleNext(username, password);
  }
}
