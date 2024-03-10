package org.example.adapter;

import org.example.adaptee.FancyUIService;
import org.example.client.IMultiRestoApp;

public class FancyUIAdapter implements IMultiRestoApp {
  private FancyUIService fancyUIService;

  public FancyUIAdapter() {
    this.fancyUIService = new FancyUIService();
  }

  @Override
  public void displayMenu(String data) {
    fancyUIService.displayMenuInJson(convertXMLToJson(data));
  }

  @Override
  public void displayRecommendations(String data) {
    fancyUIService.displayRecommendationInJson(convertXMLToJson(data));
  }

  private String convertXMLToJson(String data) {
    return data + " JSON Data";
  }
}
