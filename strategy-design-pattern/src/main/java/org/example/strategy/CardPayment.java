package org.example.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CardPayment implements PaymentStrategy {
  private String cardNo;
  private String receiverName;
  @Override
  public void pay(double amount) {
    System.out.println("Validating card details ID = " + cardNo + " Name = " + receiverName);
    System.out.println("Processing Payment for amount = " + amount);
  }
}
