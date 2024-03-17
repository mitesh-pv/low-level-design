package org.example.state;

import org.example.context.ATMMachine;
import org.example.model.Card;
import org.example.model.User;
import org.example.state.cosntant.Operations;

public abstract class ATMState {
  protected ATMMachine machine;

  public ATMState(ATMMachine machine) {
    this.machine = machine;
  }

  public void insertCard(Card card) {
    System.out.println("Invalid operation insertCard");
  }

  public void authenticate(Card card, User user, String pin) {
    System.out.println("Invalid operation authentication");
  }

  public void selectOperation(Operations operations) {
    System.out.println("Invalid operation SelectOperation");
  }

  public void withdrawCash(User user, double amount) {
    System.out.println("Invalid operation withdrawCash");
  }

  public void displayBalance(User user, Card card, String pin) {
    System.out.println("Invalid operation displayBalance");
  }

  public void changePin(User user, Card card, String oldPin, String newPin) {
    System.out.println("Invalid operation change PIN");
  }

  public void cancelTransaction() {
    System.out.println("Invalid operation cancel Transaction");
  }

  public void returnCard() {
    System.out.println("Invalid operation return card");
  }
}
