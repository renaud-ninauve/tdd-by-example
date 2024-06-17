package fr.ninauve.renaud.tddbyexample.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MultiplicationTest {

  @Test
  void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertThat(five.amount).isEqualTo(10);

    product = five.times(3);
    assertThat(five.amount).isEqualTo(15);
  }
}
