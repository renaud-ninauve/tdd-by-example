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
    Money sum = Money.dollar(5).plus(Money.dollar(5));
    assertThat(sum).isEqualTo(Money.dollar(10));
  }
}
