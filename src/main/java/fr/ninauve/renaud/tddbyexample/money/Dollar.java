package fr.ninauve.renaud.tddbyexample.money;

public class Dollar extends Money {

  public Dollar(int amount, String currency) {
    super(amount);
    this.currency = currency;
  }

  @Override
  public Money times(int multiplier) {
    return Money.dollar(amount * multiplier);
  }
}
