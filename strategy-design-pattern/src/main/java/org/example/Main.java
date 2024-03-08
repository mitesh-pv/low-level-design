package org.example;

import org.example.context.PaymentServiceContext;
import org.example.strategy.CardPayment;
import org.example.strategy.PaymentStrategy;
import org.example.strategy.UPIPayment;

public class Main {

  public static void main(String[] args) {
    PaymentStrategy strategy = new CardPayment("ABCD_1234_PQES_9882", "John Doe");
    PaymentServiceContext context = new PaymentServiceContext(strategy);
    context.payAmount(24000);

    PaymentStrategy upiStrategy = new UPIPayment("9990990909@ybl");
    context.setStrategy(upiStrategy);
    context.payAmount(10000);
  }
}