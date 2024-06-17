package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DollarTest {

  @Test
  void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertThat(product.amount).isEqualTo(10);

    product = five.times(3);
    assertThat(product.amount).isEqualTo(15);
  }

  @Test
  void equality() {
    assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
  }
}
