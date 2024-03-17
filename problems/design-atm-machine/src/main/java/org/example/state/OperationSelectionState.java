package org.example.state;

import org.example.context.ATMMachine;
import org.example.state.cosntant.Operations;

public class OperationSelectionState extends ATMState {

  public OperationSelectionState(ATMMachine machine) {
    super(machine);
  }

  @Override
  public void selectOperation(Operations operations) {
    switch (operations) {
      case CHANGE_PIN:
        machine.setState(new PinChangeState(machine));
        return;
      case DEPOSIT_MONEY:
        System.out.println("Deposit money facility is not available yet");
        return;
      case BALANCE_INQUIRY:
        machine.setState(new ShowBalanceState(machine));
        return;
      case WITHDRAW_MONEY:
        machine.setState(new CashWithdrawState(machine));
        return;
      default:
        System.out.println("Invalid operation selected");
    }
  }

 }
