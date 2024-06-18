package fr.ninauve.renaud.tddbyexample.money;

public class Sum implements Expression {
  Expression augend;
  Expression addend;

  public Sum(Expression augend, Expression addend) {
    this.augend = augend;
    this.addend = addend;
  }

  @Override
  public Money reduce(Bank bank, String to) {
    final Money reducedAugend = augend.reduce(bank, to);
    final Money reduceAddend = addend.reduce(bank, to);
    return new Money(reducedAugend.amount + reduceAddend.amount, to);
  }

  @Override
  public Expression plus(Expression addend) {
    return null;
  }
}
