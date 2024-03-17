package org.example.state;

import org.example.context.ATMMachine;
import org.example.model.Card;

public class IdleState extends ATMState {

  public IdleState(ATMMachine machine) {
    super(machine);
  }

  @Override
  public void insertCard(Card card) {
    System.out.println("Card inserted = " + card);
    machine.setState(new HasCardState(machine));
  }
}
