package com.template.java_9.stream_api_improvements;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    System.out.println("dropWhile:");
    Stream<Integer> stream = Stream.of(11, 15, 70, 40, 60, 100);
    stream.dropWhile(num -> num < 50).forEach(System.out::println);
    System.out.println("takeWhile:");
    Stream<Integer> stream2 = Stream.of(11, 15, 70, 40, 60, 100);
    stream2.takeWhile(num -> num < 50).forEach(System.out::println);
    System.out.println("iterate:");
    IntStream.iterate(1, num -> num < 30, num -> num * 3).forEach(System.out::println);
    System.out.println("ofNullable:");
    Stream<Integer> stream4 = Stream.ofNullable(null);
    stream4.forEach(System.out::println);
  }

}
