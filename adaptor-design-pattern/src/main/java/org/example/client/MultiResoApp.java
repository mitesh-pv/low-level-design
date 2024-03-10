package org.example.client;

public class MultiResoApp implements IMultiRestoApp {

  @Override
  public void displayMenu(String data) {
    System.out.println("Displaying menu in old format = " + data);
  }

  @Override
  public void displayRecommendations(String data) {
    System.out.println("Displaying recommendations in old format = " + data);
  }
}
