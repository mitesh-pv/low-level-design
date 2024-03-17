package org.example.state;

import org.example.context.ATMMachine;
import org.example.model.Card;
import org.example.model.User;

public class PinChangeState extends ATMState {

  public PinChangeState(ATMMachine machine) {
    super(machine);
  }

  @Override
  public void changePin(User user, Card card, String oldPin, String newPin) {
    if(!card.getPin().equals(oldPin)) {
      System.out.println("Old pin is not correct, please provide correct old pin to proceed");
      cancelTransaction();
      returnCard();
      machine.setState(new IdleState(machine));
      return;
    }

    card.setPin(newPin);
    System.out.println("New Pin for card no = " + card + " is set successfully");
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
