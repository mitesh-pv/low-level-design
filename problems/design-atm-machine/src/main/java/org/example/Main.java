package org.example;

import org.example.context.ATMMachine;
import org.example.model.BankAccount;
import org.example.model.Card;
import org.example.model.User;
import org.example.state.ATMState;
import org.example.state.IdleState;
import org.example.state.cosntant.Operations;

public class Main {

  public static void main(String[] args) {
    ATMMachine machine = new ATMMachine();
    ATMState state = new IdleState(machine);

    User user = new User(new Card("1234566788", "3344"),
        new BankAccount(123141312L, 20000D));

    System.out.println("Display amount flow");
    displayBalanceFlow(machine, state, user);

    System.out.println();
    System.out.println("Withdraw cash flow");
    withdrawCash(machine, state, user, 10000D);

  }

  public static void withdrawCash(ATMMachine machine, ATMState state, User user, double amount) {
    state.insertCard(user.getCard());
    state = machine.getState();

    state.authenticate(user.getCard(), user, "3344");
    state = machine.getState();

    state.selectOperation(Operations.WITHDRAW_MONEY);
    state = machine.getState();

    state.withdrawCash(user, amount);
  }

  public static void displayBalanceFlow(ATMMachine machine, ATMState state, User user) {
    state.insertCard(user.getCard());
    state = machine.getState();

    state.authenticate(user.getCard(), user, "3344");
    state = machine.getState();

    state.selectOperation(Operations.BALANCE_INQUIRY);
    state = machine.getState();

    state.displayBalance(user, user.getCard(), "3344");
  }
}