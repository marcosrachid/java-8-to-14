package com.template.java_10.local_variable_type_inference;

import java.util.Map;

public class Main {

//  private var something = "something"; only local variables work

  public static void main(String[] args) {
    var mapNameById = Map.of(1, "Marcos", 2, "Pedro", 3, "João");
    System.out.println(mapNameById);
//    var n; error
//    var emptyNull = null; error
//    var p = (String s) -> s.length() > 10; error
//    var arr = {1, 2, 3}; error
  }

}
