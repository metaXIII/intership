package com.metaxiii.fr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OPPTest {

  public OPP opp;

  @BeforeEach
  public void beforeEach() {
    opp = new OPP();
  }

  @Test
  void itShouldComparePrice() {
    final var computer1 = new Computer(2000);
    final var computer2 = new Computer(3000);
    assertTrue(computer2.isMoreExpansive(computer1));
  }

  @Test
  void itShouldCreateAMen() {
    final Human human = new Man(30);
    assertEquals("GLARGH", human.sayHello());
  }

  @Test
  void itShouldCreateAWoMen() {
    final Human human = new WoMan(30);
    assertEquals("Bonjour", human.sayHello());
  }
}
