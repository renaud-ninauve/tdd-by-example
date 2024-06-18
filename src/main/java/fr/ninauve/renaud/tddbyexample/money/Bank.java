package fr.ninauve.renaud.tddbyexample.money;

public class Bank {

  public Money reduce(Expression expression, String to) {
    final Sum sum = (Sum) expression;
    return sum.reduce(to);
  }
}
