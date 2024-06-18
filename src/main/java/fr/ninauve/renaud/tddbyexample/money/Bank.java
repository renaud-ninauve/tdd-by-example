package fr.ninauve.renaud.tddbyexample.money;

public class Bank {

  public Money reduce(Expression source, String to) {
    return source.reduce(to);
  }
}
