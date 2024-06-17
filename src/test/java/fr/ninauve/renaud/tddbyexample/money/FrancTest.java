package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FrancTest {

  @Test
  void testMultiplication() {
    Money five = Money.franc(5);
    assertThat(five.times(2)).isEqualTo(Money.franc(10));
    assertThat(five.times(3)).isEqualTo(Money.franc(15));
  }

  @Test
  void equality() {
    assertThat(Money.franc(5)).isEqualTo(Money.franc(5));
    assertThat(Money.franc(5)).isNotEqualTo(Money.franc(6));
  }
}
