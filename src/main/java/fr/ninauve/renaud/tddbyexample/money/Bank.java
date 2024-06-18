package fr.ninauve.renaud.tddbyexample.money;

import java.util.HashMap;
import java.util.Map;

public class Bank {
  private final Map<Pair, Integer> rates = new HashMap<>();

  public Money reduce(Expression source, String to) {
    return source.reduce(this, to);
  }

  public void addRate(String from, String to, int rate) {
    rates.put(new Pair(from, to), rate);
  }

  public int rate(String from, String to) {
    if (from.equals(to)) {
      return 1;
    }
    return rates.get(new Pair(from, to));
  }

  private static class Pair {
    private final String from;
    private final String to;

    private Pair(String from, String to) {
      this.from = from;
      this.to = to;
    }

    @Override
    public boolean equals(Object other) {
      Pair otherPair = (Pair) other;
      return from.equals(otherPair.from) && to.equals(otherPair.to);
    }

    @Override
    public int hashCode() {
      return 0;
    }
  }
}
