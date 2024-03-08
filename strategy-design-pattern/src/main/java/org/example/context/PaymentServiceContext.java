package org.example.context;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.strategy.PaymentStrategy;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentServiceContext {
  private PaymentStrategy strategy;

  public void payAmount(int amount) {
    strategy.pay(amount);
  }
}
