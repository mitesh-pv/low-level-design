package org.example.state;

import org.example.context.VendingMachineContext;
import org.example.model.Coin;
import org.example.model.Item;

public class HasMoneyState extends State {

  public HasMoneyState(VendingMachineContext vendingMachine) {
    super(vendingMachine);
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachineContext vendingMachine) {
    System.err.println("Already accepting coins...");
  }

  @Override
  public void insertCoin(VendingMachineContext vendingMachine, Coin coin) {
    System.out.println("Added coin = " + coin.value);
    vendingMachine.getCoins().add(coin);
  }

  @Override
  public void clickOnProductSelectionButton(VendingMachineContext vendingMachine) {
    System.out.print("Please enter the product code : ");
    vendingMachine.setState(new ProductSelectionState(vendingMachine));
  }

  @Override
  public void selectProduct(VendingMachineContext vendingMachine, String code) {
    System.err.println("Please complete adding coins first");
  }

  @Override
  public double getChange(VendingMachineContext vendingMachine, Item item) {
    System.err.println("Please complete adding coins first...");
    return 0;
  }

  @Override
  public void cancelTransaction(VendingMachineContext vendingMachine) {
    System.out.println("Cancelling transaction...");
    System.out.println("Please collect your refund..");
    getRefund(vendingMachine);
    vendingMachine.getCoins().clear();
    vendingMachine.setState(new IdleState(vendingMachine));
  }

  @Override
  public double getRefund(VendingMachineContext vendingMachine) {
    double amountProvided = calculateAmountProvided(vendingMachine);
    vendingMachine.getCoins().clear();
    System.out.println("Collect your refund of = " + amountProvided);
    return amountProvided;
  }

  @Override
  public String dispenseProduct(VendingMachineContext vendingMachine, String code) {
    System.out.println("Complete your transaction to get product dispensed");
    return null;
  }

}
