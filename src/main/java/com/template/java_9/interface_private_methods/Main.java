package com.template.java_9.interface_private_methods;

public class Main {

  public static void main(String[] args) {
    new Whatever();
  }
}

class Whatever implements MyInterface {

  Whatever() {
    this.healthCheck();
  }
}