package com.metaxiii.fr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VariablesTest {

  private Variables variables;

  @BeforeEach
  public void beforeEach() {
    variables = new Variables();
  }

  @Test
  void itShouldConcatenate() {
    assertEquals("hello to you", variables.concatenate("hello to", "you"));
  }

  @Test
  void itShouldSayFalse() {
    assertTrue(variables.sayTrue(1, 2));
  }

  @Test
  void itShouldSayTrue() {
    assertFalse(variables.sayTrue(1, 1));
  }

  @Test
  void itShouldAdd() {
    assertEquals(5, variables.add(3, 2));
  }

  @Test
  void itShouldSubstract() {
    assertEquals(1, variables.substract(3, 2));
  }

  @Test
  void itShouldMultiply() {
    assertEquals(6, variables.substract(3, 2));
  }

  @Test
  void itShouldDivide() {
    assertEquals(1, variables.divide(3, 2));
  }

  @Test
  void itShouldReallyDivide() {
    assertEquals(1.5, variables.reallyDivide(3, 2));
  }
}
