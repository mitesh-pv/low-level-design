package org.example.service;

public class DatabaseService {

  public String getUserEmail(String username) {
    return username + "@gmail.com";
  }

  public String getPhoneFromUser(String username) {
    return "98987678@" + username;
  }

  public String getFBIdFromUser(String username) {
    return username + "@fb.com";
  }


}
