package org.example.state;

import org.example.context.VendingMachineContext;
import org.example.model.Coin;
import org.example.model.Item;

public class DispenseState extends State {

  public DispenseState(VendingMachineContext vendingMachine) {
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
    System.err.println("Invalid operation product selection button");
  }

  @Override
  public void selectProduct(VendingMachineContext vendingMachine, String code) {
    System.err.println("Invalid operation select product");
  }

  @Override
  public double getChange(VendingMachineContext vendingMachine, Item item) {
    System.err.println("Invalid operation get change");
    return 0;
  }

  @Override
  public void cancelTransaction(VendingMachineContext vendingMachine) {
    System.err.println("Invalid operation cancel transaction");
  }

  @Override
  public double getRefund(VendingMachineContext vendingMachine) {
    System.err.println("Invalid operation get refund");
    return 0;
  }

  @Override
  public String dispenseProduct(VendingMachineContext vendingMachine, String code) {
    int shelfNo = Character.getNumericValue(code.charAt(0));
    int itemNo = Character.getNumericValue(code.charAt(1));

    Item item = vendingMachine.getInventory().getShelf()[shelfNo].getItem()[itemNo];
    item.setPresent(false);

    System.out.println("Please collect your product = " + item.getItemType());
    vendingMachine.setState(new IdleState(vendingMachine));
    return String.valueOf(item.getItemType());
  }
}
