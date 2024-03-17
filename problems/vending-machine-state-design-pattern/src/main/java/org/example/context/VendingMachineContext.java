package org.example.context;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.example.model.Coin;
import org.example.model.Inventory;
import org.example.state.IdleState;
import org.example.state.State;

@Getter
@Setter
public class VendingMachineContext {
  private Inventory inventory;
  private List<Coin> coins;
  private State state;

  public VendingMachineContext() {
    this.inventory = new Inventory();
    this.coins = new ArrayList<>();
    this.state = new IdleState(this);
  }

}
