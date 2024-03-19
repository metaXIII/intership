package com.metaxiii.fr;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasicSyntaxTest {

  private BasicSyntax basic;

  @BeforeEach
  public void beforeEach() {
    basic = new BasicSyntax();
  }

  @Test
  void itShouldSayHelloWithFixedName() {
    assertDoesNotThrow(() -> basic.sayHelloWithFixedName());
  }

  @Test
  void itShouldSayHelloWithNoVariables() {
    assertDoesNotThrow(() -> basic.sayHelloWithNoVariables());
  }

  @Test
  void itShouldSayHelloWithYourName() {
    assertDoesNotThrow(() -> basic.sayHelloWithYourName("Your name here"));
  }

  @Test
  void itShouldCheckIfYourMajor() {
    assertFalse(basic.areYouMajor("a"));
    assertFalse(basic.areYouMajor("10"));
    assertFalse(basic.areYouMajor());
  }
}
