package com.template.java_9.interface_private_methods;

public interface MyInterface {

  default void healthCheck() {
    System.out.println(this.customToString());
  }

  private String customToString() {
    return String.format("%s is ok!", this);
  };

}
