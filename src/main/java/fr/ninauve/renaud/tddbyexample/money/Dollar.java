package fr.ninauve.renaud.tddbyexample.money;

public class Dollar extends Money {
  private String currency = "USD";

  public Dollar(int amount) {
    super(amount);
  }

  @Override
  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  @Override
  public String currency() {
    return currency;
  }
}
