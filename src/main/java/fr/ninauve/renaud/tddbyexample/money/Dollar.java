package fr.ninauve.renaud.tddbyexample.money;

public class Dollar extends Money {

  public Dollar(int amount) {
    super(amount);
  }

  @Override
  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
}
