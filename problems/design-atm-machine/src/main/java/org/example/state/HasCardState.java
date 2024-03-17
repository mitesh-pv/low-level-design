package org.example.state;

import java.util.Arrays;
import org.example.context.ATMMachine;
import org.example.model.Card;
import org.example.model.User;
import org.example.state.cosntant.Operations;

public class HasCardState extends ATMState {

  public HasCardState(ATMMachine machine) {
    super(machine);
  }

  @Override
  public void authenticate(Card card, User user, String pin) {
    if(!pin.equals(card.getPin())) {
      System.out.println("Invalid pin provided");
      cancelTransaction();
      returnCard();
      machine.setState(new IdleState(machine));
      return;
    }

    System.out.println("Authentication successful for card = " + card + ", User = " + user);
    showAvailableOperations();
    machine.setState(new OperationSelectionState(machine));
  }

  @Override
  public void cancelTransaction() {
    System.out.println("Cancelling transaction");
  }

  @Override
  public void returnCard() {
    System.out.println("Please collect your card");
  }

  private void showAvailableOperations() {
    System.out.println("Select one of the following operations: ");
    Arrays.stream(Operations.values()).forEach(System.out::println);
  }
}
