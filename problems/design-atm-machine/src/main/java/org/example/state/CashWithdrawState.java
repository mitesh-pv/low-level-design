package org.example.state;

import org.example.context.ATMMachine;
import org.example.model.BankAccount;
import org.example.model.User;

public class CashWithdrawState extends ATMState {

  public CashWithdrawState(ATMMachine machine) {
    super(machine);
  }

  @Override
  public void withdrawCash(User user, double amount) {
    BankAccount account = user.getAccount();
    if(amount > account.getBalance()) {
      System.out.println("Not enough balance to withdraw");
      cancelTransaction();
      returnCard();
      machine.setState(new IdleState(machine));
      return;
    }

    account.setBalance(account.getBalance() - amount);
    System.out.println("Please withdraw cash of " + account);
    returnCard();
    machine.setState(new IdleState(machine));
  }

  @Override
  public void cancelTransaction() {
    System.out.println("Cancelling transaction");
  }

  @Override
  public void returnCard() {
    System.out.println("Please collect your card");
  }
}
