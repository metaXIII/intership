package com.metaxiii.fr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonnaciTest {

  private Fibonnaci fibonnaci;

  @BeforeEach
  public void beforeEach() {
    fibonnaci = new Fibonnaci();
  }

  @Test
  void itShouldFiboWith0() {
    assertEquals(0, fibonnaci.fibo(0));
  }

  @Test
  void itShouldFiboWith1() {
    assertEquals(1, fibonnaci.fibo(1));
  }

  @Test
  void itShouldFiboWith2() {
    assertEquals(2, fibonnaci.fibo(2));
  }

  @Test
  void itShouldFiboWith3() {
    assertEquals(3, fibonnaci.fibo(3));
  }

  @Test
  void itShouldFiboWith4() {
    assertEquals(5, fibonnaci.fibo(4));
  }

  @Test
  void itShouldFiboWith5() {
    assertEquals(8, fibonnaci.fibo(5));
  }

  @Test
  void itShouldFiboWith6() {
    assertEquals(13, fibonnaci.fibo(6));
  }

  @Test
  void itShouldFiboWith21() {
    assertEquals(10946, fibonnaci.fibo(21));
  }
}
