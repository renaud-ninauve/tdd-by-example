package fr.ninauve.renaud.tddbyexample.money;

public class Franc extends Money {

  public Franc(int amount) {
    super(amount);
  }

  public Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }

  @Override
  public boolean equals(Object other) {
    final Money otherDollar = (Money) other;
    return amount == otherDollar.amount;
  }
}
