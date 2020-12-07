package com.template.java_9.stack_walking_api;

import static java.lang.StackWalker.Option.RETAIN_CLASS_REFERENCE;

public class Main {

  public static void main(String[] args) {
    Foo.whoIsIt();
  }

}

class Foo {
  public static void whoIsIt() {
    StackWalker walker = StackWalker.getInstance(RETAIN_CLASS_REFERENCE);
    System.out.println(walker.getCallerClass());
  }
}