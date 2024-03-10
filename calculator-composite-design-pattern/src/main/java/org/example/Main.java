package org.example;

import org.example.component.ArithmeticExpression;
import org.example.component.Expression;
import org.example.component.Number;
import org.example.component.Operation;

public class Main {

  public static void main(String[] args) {
    // 21 / (9 - 6)

    ArithmeticExpression _21 = new Number(21);
    ArithmeticExpression _9 = new Number(9);
    ArithmeticExpression _6 = new Number(6);

    ArithmeticExpression subtractOperation = new Expression(_9, _6, Operation.SUBTRACT);
    ArithmeticExpression divideOperation = new Expression(_21, subtractOperation, Operation.DIVIDE);

    System.out.println(divideOperation.evaluate());
  }
}