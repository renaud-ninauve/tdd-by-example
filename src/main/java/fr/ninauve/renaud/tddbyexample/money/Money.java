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

  @Override
  public Expression times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  public String currency() {
    return currency;
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }

  @Override
  public Expression plus(Expression addend) {
    return new Sum(this, addend);
  }

  @Override
  public Money reduce(Bank bank, String to) {
    int rate = bank.rate(this.currency, to);
    return new Money(amount / rate, to);
  }
}
