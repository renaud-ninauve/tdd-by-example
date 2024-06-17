package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MoneyTest {

  @Test
  void equality() {
    assertThat(Money.franc(5)).isNotEqualTo(Money.dollar(5));
    assertThat(Money.dollar(5)).isNotEqualTo(Money.franc(5));
  }
}
