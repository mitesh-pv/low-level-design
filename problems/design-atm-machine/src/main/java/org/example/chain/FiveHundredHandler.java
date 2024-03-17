package org.example.chain;

import org.example.context.ATMMachine;
import org.example.state.CashWithdrawState;

public class FiveHundredHandler extends CashWithdrawalProcessor {

  public FiveHundredHandler(CashWithdrawalProcessor next) {
    super(next);
  }

  @Override
  public void withdrawCash(double amount, ATMMachine machine) {

  }
}
