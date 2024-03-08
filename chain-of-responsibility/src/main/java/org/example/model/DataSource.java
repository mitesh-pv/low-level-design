package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class DataSource {
  private Map<String, String> map;

  public DataSource() {
    this.map = new HashMap<>();
    map.put("admin_user", "admin_pass");
    map.put("user", "pass");
  }

  public boolean isValidUser(String username) {
    return this.map.containsKey(username);
  }

  public boolean isValidPassword(String username, String password) {
    return map.get(username).equals(password);
  }
}
