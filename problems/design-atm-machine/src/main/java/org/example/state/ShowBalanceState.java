package org.example.state;

import org.example.context.ATMMachine;
import org.example.model.Card;
import org.example.model.User;

public class ShowBalanceState extends ATMState {

  public ShowBalanceState(ATMMachine machine) {
    super(machine);
  }

  @Override
  public void displayBalance(User user, Card card, String pin) {
    if(!card.getPin().equals(pin)) {
      System.out.println("Pin provided is invalid, please retry again");
      cancelTransaction();
      returnCard();
      machine.setState(new IdleState(machine));
      return;
    }

    System.out.println(
        "Current balance for bank account = " + user.getAccount() + " is = " + user.getAccount()
            .getBalance());
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
