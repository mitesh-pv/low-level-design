package org.example.state;

import org.example.context.VendingMachineContext;
import org.example.model.Coin;
import org.example.model.Item;

public class ProductSelectionState extends State {

  public ProductSelectionState(VendingMachineContext vendingMachine) {
    super(vendingMachine);
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachineContext vendingMachine) {
    System.err.println("Invalid operation click insert coin button");
  }

  @Override
  public void insertCoin(VendingMachineContext vendingMachine, Coin coin) {
    System.err.println("Invalid operation insert coin");
  }

  @Override
  public void clickOnProductSelectionButton(VendingMachineContext vendingMachine) {
    System.err.println("Invalid operation, Enter the code to choose the product");
  }

  @Override
  public void selectProduct(VendingMachineContext vendingMachine, String code) {
    System.out.println(code);

    int shelfNo = Character.getNumericValue(code.charAt(0));
    int itemNo = Character.getNumericValue(code.charAt(1));

    final Item item = vendingMachine.getInventory().getShelf()[shelfNo].getItem()[itemNo];
    if(!item.isPresent()) {
      System.err.println("Item is not present... ");
      System.err.println("Please choose another item");
      cancelTransaction(vendingMachine);
      return;
    }

    double amountProvided = calculateAmountProvided(vendingMachine);
    if(item.getPrice() > amountProvided) {
      System.err.println("Amount provided is insufficient");
      System.err.println("Cancelling transaction");
      cancelTransaction(vendingMachine);
      return;
    }

    getChange(vendingMachine, item);
    vendingMachine.getCoins().clear();
    vendingMachine.setState(new DispenseState(vendingMachine));
  }

  @Override
  public double getChange(VendingMachineContext vendingMachine, Item item) {
    double changeAmount = calculateAmountProvided(vendingMachine) - item.getPrice();
    System.out.println("Please collect change of = " + changeAmount);
    return changeAmount;
  }

  @Override
  public void cancelTransaction(VendingMachineContext vendingMachine) {
    System.err.println("Cancelling transaction");
    System.err.println("Please collect your refund...");
    getRefund(vendingMachine);
    vendingMachine.setState(new IdleState(vendingMachine));
  }

  @Override
  public double getRefund(VendingMachineContext vendingMachine) {
    double amountProvided = calculateAmountProvided(vendingMachine);
    vendingMachine.getCoins().clear();
    System.err.println("Collect your refund...");
    return amountProvided;
  }

  @Override
  public String dispenseProduct(VendingMachineContext vendingMachine, String code) {
    System.err.println("Please choose product to get the product");
    return null;
  }

}
