package fr.ninauve.renaud.tddbyexample.money;

public class Sum implements Expression {
  Money augend;
  Money addend;

  public Sum(Money augend, Money addend) {
    this.augend = augend;
    this.addend = addend;
  }

  @Override
  public Money reduce(Bank bank, String to) {
    final Money reducedAugend = augend.reduce(bank, to);
    final Money reduceAddend = addend.reduce(bank, to);
    return new Money(reducedAugend.amount + reduceAddend.amount, to);
  }
}
