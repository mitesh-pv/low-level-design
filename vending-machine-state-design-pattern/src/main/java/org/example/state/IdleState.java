package org.example.state;

import org.example.context.VendingMachineContext;
import org.example.model.Coin;
import org.example.model.Item;

public class IdleState extends State {

  public IdleState(VendingMachineContext vendingMachine) {
    super(vendingMachine);
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachineContext vendingMachine) {
    System.out.println("Insert your coins please...");
    vendingMachine.setState(new HasMoneyState(vendingMachine));
  }

  @Override
  public void insertCoin(VendingMachineContext vendingMachine, Coin coin) {
    System.err.println("Invalid operation insert coin from idle state");
  }

  @Override
  public void clickOnProductSelectionButton(VendingMachineContext vendingMachine) {
    System.err.println("Invalid operation product selection from idle state");
  }

  @Override
  public void selectProduct(VendingMachineContext vendingMachine, String code) {
    System.err.println("Invalid operation select product from idle state");
  }

  @Override
  public double getChange(VendingMachineContext vendingMachine, Item item) {
    System.err.println("Invalid operation getChange from idle state");
    return 0;
  }

  @Override
  public void cancelTransaction(VendingMachineContext vendingMachine) {
    System.err.println("Invalid operation cancelTransaction from idle state");
  }

  @Override
  public double getRefund(VendingMachineContext vendingMachine) {
    System.err.println("Invalid operation get refund from idle state");
    return 0;
  }

  @Override
  public String dispenseProduct(VendingMachineContext vendingMachine, String code) {
    System.err.println("Invalid operation dispense product from idle state");
    return null;
  }
}
