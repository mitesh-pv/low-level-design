package org.example;

import org.example.adapter.FancyUIAdapter;
import org.example.client.IMultiRestoApp;
import org.example.client.MultiResoApp;

public class Main {

  public static void main(String[] args) {
    System.out.println("Old Format");
    IMultiRestoApp oldApp = new MultiResoApp();
    oldApp.displayMenu("Old Data");
    oldApp.displayRecommendations("Old Data");

    System.out.println("\nNew Format");
    IMultiRestoApp fancyUIAdapter = new FancyUIAdapter();
    fancyUIAdapter.displayMenu("Old Data");
    fancyUIAdapter.displayRecommendations("Old Data");
  }
}