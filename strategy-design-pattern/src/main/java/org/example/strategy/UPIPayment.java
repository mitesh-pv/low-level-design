package org.example.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UPIPayment implements PaymentStrategy {
  private String upiId;
  @Override
  public void pay(double amount) {
    System.out.println("Validating UPI details ID = " + upiId);
    System.out.println("Processing Payment for amount = " + amount);
  }
}
