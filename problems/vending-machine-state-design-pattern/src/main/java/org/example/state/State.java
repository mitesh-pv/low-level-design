package org.example.state;

import org.example.context.VendingMachineContext;
import org.example.model.Coin;
import org.example.model.Item;

public abstract class State {
  protected VendingMachineContext vendingMachine;

  public State(VendingMachineContext vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  public abstract void clickOnInsertCoinButton(VendingMachineContext vendingMachine);
  public abstract void insertCoin(VendingMachineContext vendingMachine, Coin coin);
  public abstract void clickOnProductSelectionButton(VendingMachineContext vendingMachine);
  public abstract void selectProduct(VendingMachineContext vendingMachine, String code);
  public abstract double getChange(VendingMachineContext vendingMachine, Item item);
  public abstract void cancelTransaction(VendingMachineContext vendingMachine);
  public abstract double getRefund(VendingMachineContext vendingMachine);
  public abstract String dispenseProduct(VendingMachineContext vendingMachine, String code);

  protected double calculateAmountProvided(VendingMachineContext vendingMachine) {
    final Double amountProvided = vendingMachine.getCoins().stream()
        .mapToDouble(Coin::getValue)
        .sum();

    return amountProvided;
  }
}
