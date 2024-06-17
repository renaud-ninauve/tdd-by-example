package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DollarTest {

  @Test
  void testMultiplication() {
    Money five = Money.dollar(5);
    assertThat(five.times(2)).isEqualTo(Money.dollar(10));
    assertThat(five.times(3)).isEqualTo(Money.dollar(15));
  }

  @Test
  void equality() {
    assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
    assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(6));
  }
}
