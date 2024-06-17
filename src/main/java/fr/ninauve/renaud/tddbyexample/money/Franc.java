package fr.ninauve.renaud.tddbyexample.money;

public class Franc extends Money {

  public Franc(int amount, String currency) {
    super(amount);
    this.currency = "CHF";
  }

  @Override
  public Money times(int multiplier) {
    return Money.franc(amount * multiplier);
  }
}
