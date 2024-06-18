package fr.ninauve.renaud.tddbyexample.money;

public class Money implements Expression {
  protected int amount;
  protected String currency;

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  protected Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  @Override
  public boolean equals(Object other) {
    final Money otherDollar = (Money) other;
    return amount == otherDollar.amount && currency.equals(otherDollar.currency);
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  public String currency() {
    return currency;
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }

  public Expression plus(Money addend) {
    return new Sum(this, addend);
  }
}
