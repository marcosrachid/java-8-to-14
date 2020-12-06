package com.template.java_9.getClass_getPackage;

public class Main {

  public static void main(String[] args) {
    Whatever whatever = new Whatever();
    System.out.printf("Class: %s and Package %s", whatever.getClass(), whatever.getClass().getPackage());
  }
}

class Whatever {}

