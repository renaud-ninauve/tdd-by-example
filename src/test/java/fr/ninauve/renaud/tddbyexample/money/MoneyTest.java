package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MoneyTest {

  @Test
  void equality() {
    assertThat(Money.franc(5)).isNotEqualTo(Money.dollar(5));
    assertThat(Money.dollar(5)).isNotEqualTo(Money.franc(5));
  }

  @Test
  void currency() {
    assertThat(Money.franc(1).currency()).isEqualTo("CHF");
    assertThat(Money.dollar(1).currency()).isEqualTo("USD");
  }
}
