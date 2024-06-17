package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DollarTest {

  @Test
  void testMultiplication() {
    Money five = new Dollar(5);
    assertThat(five.times(2)).isEqualTo(new Dollar(10));
    assertThat(five.times(3)).isEqualTo(new Dollar(15));
  }

  @Test
  void equality() {
    assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
    assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
  }
}
