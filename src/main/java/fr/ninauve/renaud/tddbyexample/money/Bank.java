package fr.ninauve.renaud.tddbyexample.money;

public class Bank {

  public Money reduce(Expression source, String to) {
    if (source instanceof Money) {
      return (Money) source;
    }
    final Sum sum = (Sum) source;
    return sum.reduce(to);
  }
}
