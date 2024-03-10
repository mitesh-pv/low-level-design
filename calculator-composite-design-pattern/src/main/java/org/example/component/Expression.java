package org.example.component;

public class Expression implements ArithmeticExpression {
  private ArithmeticExpression leftExpression;
  private ArithmeticExpression rightExpression;
  private Operation operation;

  public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
    this.operation = operation;
  }

  @Override
  public int evaluate() {
    int value = 0;
    switch (operation) {
      case ADD:
        value = leftExpression.evaluate() + rightExpression.evaluate();
        break;
      case DIVIDE:
        value = leftExpression.evaluate() / rightExpression.evaluate();
        break;
      case SUBTRACT:
        value = leftExpression.evaluate() - rightExpression.evaluate();
        break;
      case MULTIPLY:
        value = leftExpression.evaluate() * rightExpression.evaluate();
        break;
    }
    return value;
  }
}
