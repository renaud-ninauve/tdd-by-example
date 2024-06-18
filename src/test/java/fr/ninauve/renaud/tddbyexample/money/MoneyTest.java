package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MoneyTest {

  @Test
  void equality() {
    assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
    assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(6));
    assertThat(Money.franc(5)).isNotEqualTo(Money.dollar(5));
    assertThat(Money.dollar(5)).isNotEqualTo(Money.franc(5));
  }

  @Test
  void currency() {
    assertThat(Money.franc(1).currency()).isEqualTo("CHF");
    assertThat(Money.dollar(1).currency()).isEqualTo("USD");
  }

  @Test
  void testMultiplication() {
    Money five = Money.dollar(5);
    assertThat(five.times(2)).isEqualTo(Money.dollar(10));
    assertThat(five.times(3)).isEqualTo(Money.dollar(15));
  }

  @Test
  void testSimpleAddition() {
    Expression sum = Money.dollar(5).plus(Money.dollar(5));
    Money reduced = new Bank().reduce(sum, "USD");
    assertThat(reduced).isEqualTo(Money.dollar(10));
  }

  @Test
  void testPlusReturnsSum() {
    final Money five = Money.dollar(5);
    final Expression result = five.plus(five);
    final Sum sum = (Sum) result;
    assertThat(sum.augend).isEqualTo(five);
    assertThat(sum.addend).isEqualTo(five);
  }

  @Test
  void testReduceSum() {
    final Expression result = new Sum(Money.dollar(3), Money.dollar(4));
    final Bank bank = new Bank();
    final Money reduced = bank.reduce(result, "USD");
    assertThat(reduced).isEqualTo(Money.dollar(7));
  }

  @Test
  void testReduceMoney() {
    final Bank bank = new Bank();
    final Money reduced = bank.reduce(Money.dollar(1), "USD");
    assertThat(reduced).isEqualTo(Money.dollar(1));
  }

  @Test
  void testReduceMoneyDifferentCurrencies() {
    final Bank bank = new Bank();
    bank.addRate("CHF", "USD", 2);
    final Money result = bank.reduce(Money.franc(2), "USD");
    assertThat(result).isEqualTo(Money.dollar(1));
  }

  @Test
  void testIdentityRate() {
    assertThat(new Bank().rate("USD", "USD")).isEqualTo(1);
  }
}
