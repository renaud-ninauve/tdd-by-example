package fr.ninauve.renaud.tddbyexample.money;

public abstract class Money {
  protected int amount;

  public static Money franc(int amount) {
    return new Franc(amount);
  }

  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  public Money(int amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object other) {
    final Money otherDollar = (Money) other;
    return amount == otherDollar.amount && getClass().equals(other.getClass());
  }

  public abstract Money times(int multiplier);
}
