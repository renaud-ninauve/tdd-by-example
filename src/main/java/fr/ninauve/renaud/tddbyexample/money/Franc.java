package fr.ninauve.renaud.tddbyexample.money;

public class Franc extends Money {
  private String currency = "CHF";

  public Franc(int amount) {
    super(amount);
  }

  @Override
  public Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }

  @Override
  public String currency() {
    return currency;
  }
}
