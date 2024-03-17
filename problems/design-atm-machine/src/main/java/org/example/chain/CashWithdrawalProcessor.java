package org.example.chain;


import org.example.context.ATMMachine;

public abstract class CashWithdrawalProcessor {
  protected CashWithdrawalProcessor next;

  public CashWithdrawalProcessor(CashWithdrawalProcessor next) {
    this.next = next;
  }

  public abstract void withdrawCash(double amount, ATMMachine machine);
}
