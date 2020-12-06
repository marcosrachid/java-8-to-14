package com.template.java_9.collection_factory;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    List<String> list = List.of("this", "is", "a", "list");
    System.out.println(list);
    Set<String> set = Set.of("this", "is", "a", "set");
    System.out.println(set);
    Map<String, String> map = Map.of("key", "value1", "Key2", "value2", "key3", "value3");
    System.out.println(map);
    Map.Entry<String, String> e1 = Map.entry("key-entry", "value-entry");
    Map.Entry<String, String> e2 = Map.entry("key-entry-2", "value-entry-2");
    Map<String, String> mapEntry = Map.ofEntries(e1, e2);
    System.out.println(mapEntry);
  }
}
