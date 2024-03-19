package com.metaxiii.fr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoopTest {

  private Loop loop;

  @BeforeEach
  void beforeEach() {
    loop = new Loop();
  }

  @Test
  //try to do it with do while, while and for each loop
  void itShouldLoopWithList() {
    final var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    final var result = loop.loop(list);
    assertEquals(10, result.size());
    assertEquals(2, result.get(0));
    assertEquals(4, result.get(1));
    assertEquals(6, result.get(2));
    assertEquals(8, result.get(3));
    assertEquals(10, result.get(4));
    assertEquals(12, result.get(5));
    assertEquals(14, result.get(6));
    assertEquals(16, result.get(7));
    assertEquals(18, result.get(8));
    assertEquals(20, result.get(9));
  }
}
