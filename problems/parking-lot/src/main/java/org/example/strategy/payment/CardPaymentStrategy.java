package org.example.strategy.payment;

public class CardPaymentStrategy implements PaymentStrategy {
  private String cardNumber;
  private String name;

  public CardPaymentStrategy(String cardNumber, String name) {
    this.cardNumber = cardNumber;
    this.name = name;
  }

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing amount of " + amount + " from Card = " + cardNumber + " name = " + name);
    System.out.println("Amount processed successfully");
  }
}
