package org.example.context;

import lombok.Getter;
import lombok.Setter;
import org.example.state.ATMState;
import org.example.state.IdleState;

@Getter
@Setter
public class ATMMachine {
  private ATMState state;

  public ATMMachine() {
    state = new IdleState(this);
  }

}
