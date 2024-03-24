package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.example.service.PaymentService;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bill {
  private long id;
  private long startKm;
  private double amount;
  private boolean isPaid;
  private PaymentService paymentService;

  public void calculateAmount(Vehicle vehicle) {
    long kms = vehicle.getKmDriven() - startKm;
    double amount = 12.5 * kms;
    this.amount = amount;
  }

  public void payAmount() {
    boolean paySuccess = this.paymentService.payAmount(this.amount);
    if(paySuccess) isPaid = true;
  }
}
