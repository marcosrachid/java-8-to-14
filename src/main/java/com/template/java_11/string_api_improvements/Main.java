package com.template.java_11.string_api_improvements;

public class Main {

  public static void main(String[] args) {
    var something = "foo bar ";
    var repeated = something.repeat(5);
    System.out.println(repeated);
    var isBlank = " ".isBlank();
    System.out.println("isBlank: " + isBlank);
    var removeWhiteSpaces = " Hello my friend ".strip();
    System.out.println(removeWhiteSpaces);
    var what = "do\nit\nnow".lines();
    what.forEach(System.out::println);
  }

}
