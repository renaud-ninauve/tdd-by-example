package fr.ninauve.renaud.tddbyexample.money;

public class Franc extends Money {

  public Franc(int amount) {
    super(amount);
    this.currency = "CHF";
  }

  @Override
  public Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }
}
