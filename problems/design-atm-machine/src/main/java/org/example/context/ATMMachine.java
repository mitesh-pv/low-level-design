package org.example.context;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.example.state.ATMState;
import org.example.state.IdleState;

@Getter
@Setter
public class ATMMachine {
  private ATMState state;
  private Map<Integer, Integer> cashStock;

  public ATMMachine() {
    state = new IdleState(this);
    cashStock = new HashMap<>();
    loadCache();
  }

  private void loadCache() {
    cashStock.put(2000, 10);
    cashStock.put(500, 5);
    cashStock.put(100, 20);
  }

  public void updateStock(int denomination, int value) {
    cashStock.put(denomination, value);
  }

}
