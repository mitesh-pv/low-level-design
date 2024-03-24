package org.example.strategy;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class CardPaymentStrategy implements PaymentStrategy {
  private long cardNo;
  private String cardHolderName;
  private String pin;

  @Override
  public boolean pay(double amount) {
    System.out.println("Payment of amount = " + amount + " completed successfully via card payment "
        + " with details = " + this);
    return true;
  }
}
