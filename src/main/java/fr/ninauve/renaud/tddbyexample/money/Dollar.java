package fr.ninauve.renaud.tddbyexample.money;

public class Dollar extends Money {

  public Dollar(int amount) {
    super(amount);
  }

  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  @Override
  public boolean equals(Object other) {
    final Dollar otherDollar = (Dollar) other;
    return amount == otherDollar.amount;
  }
}
