package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.strategy.PaymentStrategy;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentService {
  private PaymentStrategy paymentStrategy;

  public boolean payAmount(double amount) {
    paymentStrategy.pay(amount);
    return true;
  }
}
