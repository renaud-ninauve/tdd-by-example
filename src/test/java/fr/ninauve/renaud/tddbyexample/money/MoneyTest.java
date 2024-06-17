package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MoneyTest {

  @Test
  void equality() {
    assertThat(new Franc(5)).isNotEqualTo(new Dollar(5));
    assertThat(new Dollar(5)).isNotEqualTo(new Franc(5));
  }
}
