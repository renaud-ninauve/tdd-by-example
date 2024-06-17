package fr.ninauve.renaud.tddbyexample.money;

public class Dollar extends Money {

  public Dollar(int amount) {
    super(amount);
    this.currency = "USD";
  }

  @Override
  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
}
