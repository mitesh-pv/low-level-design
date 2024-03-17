package org.example.chain;

import org.example.context.ATMMachine;
import org.example.state.CashWithdrawState;

public class TwoThousandHandler extends CashWithdrawalProcessor {

  public TwoThousandHandler(CashWithdrawalProcessor next) {
    super(next);
  }

  @Override
  public void withdrawCash(double amount, ATMMachine machine) {

  }
}
