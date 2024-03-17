package org.example;

import java.util.Random;
import org.example.context.VendingMachineContext;
import org.example.model.Coin;
import org.example.model.Inventory;
import org.example.model.Item;
import org.example.model.ItemShelf;
import org.example.model.ItemType;
import org.example.state.State;

public class Main {

  public static void main(String[] args) {
    VendingMachineContext context = new VendingMachineContext();
    context.setInventory(getInventory());
    State state = context.getState();

    System.out.println();
    System.out.println("============== Happy Path ==============");
    happyPath(state, context);
    System.out.println("============== ============== ==============");


    System.out.println();
    System.out.println("============ Cancel Transaction after has money state ============");
    cancelTransactionAfterHasMoneyState(state, context);
    System.out.println("============== ============== ===============");
  }

  private static void cancelTransactionAfterHasMoneyState(State state, VendingMachineContext context) {
    // Click on insert coin button
    state.clickOnInsertCoinButton(context);
    state = context.getState();

    // insert coins
    state.insertCoin(context, Coin.TWENTY_FIVE);

    // Cancel Transaction
    state.cancelTransaction(context);
  }

  private static void happyPath(State state, VendingMachineContext context) {
    // Click on insert coin button
    state.clickOnInsertCoinButton(context);
    state = context.getState();

    // insert coins
    state.insertCoin(context, Coin.TWENTY_FIVE);
    state.insertCoin(context, Coin.TWENTY_FIVE);

    // Click on product selection button
    state.clickOnProductSelectionButton(context);
    state = context.getState();

    // Choose product
    state.selectProduct(context, "02");
    state = context.getState();

    // Dispense product
    state.dispenseProduct(context, "02");
  }

  private static Inventory getInventory() {
    int n = 3;
    ItemShelf[] itemShelves = new ItemShelf[n];

    for(int i=0; i<n; ++i) {
      itemShelves[i] = new ItemShelf();
    }

    ItemType[] itemTypes = {ItemType.PEPSI, ItemType.COKE, ItemType.LIME, ItemType.SODA};
    int[] amount = {40, 20, 10, 50};
    Random random = new Random();
    for(int i=0; i<n; ++i) {
      Item[] items = new Item[n];
      for(int j=0; j<n; ++j) {
        Item item = new Item(itemTypes[random.nextInt(4)], amount[random.nextInt(4)], true);
        items[j] = item;
      }
      itemShelves[i].setItem(items);
    }

    System.out.println("==============   Vending Machine  ==============");
    for(int i=0; i<n; ++i) {
      System.out.println(itemShelves[i]);
    }
    System.out.println("==============  ==============   ==============");

    return new Inventory(itemShelves);
  }
}