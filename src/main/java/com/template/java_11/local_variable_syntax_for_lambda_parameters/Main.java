package com.template.java_11.local_variable_syntax_for_lambda_parameters;

import java.util.function.Function;

public class Main {

  public static void main(String[] args) {
    Function<String, String> fun = (var s1) -> "My String: " + s1;
    System.out.println(fun.apply("Test"));
  }

}
