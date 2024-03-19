package com.metaxiii.fr;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CollectionTest {

  private Collection collection;

  @BeforeEach
  void beforeEach() {
    collection = new Collection();
  }

  @Test
  void itShouldAddItemsInList() {
    collection.addInList(new Item(1, "first item"));
    collection.addInList(new Item(2, "second item"));
    collection.addInList(null);
    collection.addInList(new Item(2, "second item"));
    collection.addInList(new Item(3, "third item"));
    assertEquals(5, collection.getItems().size());
  }

  @Test
  void itShouldAddItemsInSet() {
    collection.addInSet(new Item(1, "first item"));
    collection.addInSet(new Item(2, "second item"));
    collection.addInSet(null);
    collection.addInSet(new Item(2, "second item"));
    collection.addInSet(new Item(3, "third item"));
    assertEquals(3, collection.getItems().size());
  }

  @Test
  void itShouldAddItemsInMap() {
    collection.addInMap("legal", List.of(new Item(1, "first item"), new Item(2, "second item")));
    collection.addInMap("Illegal", List.of(new Item(1, "first item"), new Item(2, "second item")));
    assertEquals(3, collection.getInfoItems().size());
    assertEquals(2, collection.getInfoItems().get("legal").size());
    assertEquals(1, collection.getInfoItems().get("legal").size());
    assertEquals(1, collection.getInfoItems().size());
  }
}
