package org.example.client;

import org.example.handler.Handler;

public class AuthServiceClient {
  private Handler handler;

  public AuthServiceClient(Handler handler) {
    this.handler = handler;
  }

  public boolean login(String username, String password) {
    if(handler.handle(username, password)) {
      return true;
    }

    return false;
  }
}
