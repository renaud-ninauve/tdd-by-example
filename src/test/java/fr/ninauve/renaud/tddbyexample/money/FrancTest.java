package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FrancTest {

  @Test
  void testMultiplication() {
    Franc five = new Franc(5);
    assertThat(five.times(2)).isEqualTo(new Franc(10));
    assertThat(five.times(3)).isEqualTo(new Franc(15));
  }

  @Test
  void equality() {
    assertThat(new Franc(5)).isEqualTo(new Franc(5));
    assertThat(new Franc(5)).isNotEqualTo(new Franc(6));
  }
}
