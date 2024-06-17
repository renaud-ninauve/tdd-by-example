package fr.ninauve.renaud.tddbyexample.money;

public class Money {
  protected int amount;

  public Money(int amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object other) {
    final Money otherDollar = (Money) other;
    return amount == otherDollar.amount && getClass().equals(other.getClass());
  }
}
