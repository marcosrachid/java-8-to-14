package com.template.java_9.completableFuture_api_enhacements;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  private static Integer DEFAULT_SUM = 0;

  private static Integer sum(Integer a, Integer b) {
    return a + b;
  }

  private static void withTimeout(AtomicInteger a) {
    CompletableFuture.supplyAsync(() -> a.get())
        .thenCombine(CompletableFuture.supplyAsync(() -> a.get() + 1), Main::sum)
        .orTimeout(1, TimeUnit.NANOSECONDS)
        .whenComplete((amount, error) -> {
          if (error == null) {
            System.out.printf("amount is %s\n", amount);
          } else {
            System.out.println("timeout");
          }
        });
  }

  private static void withCompleteOnTimeout(AtomicInteger a) {
    CompletableFuture.supplyAsync(() -> a.get())
        .thenCombine(CompletableFuture.supplyAsync(() -> a.get() + 1), Main::sum)
        .completeOnTimeout(DEFAULT_SUM, 1, TimeUnit.NANOSECONDS)
        .thenAccept(amount -> {
          System.out.printf("amount is %s\n", amount);
        });
  }

  public static void main(String[] args) {
    System.out.println("withTimeout");
    for (AtomicInteger i = new AtomicInteger(0); i.get() < 100; i.addAndGet(1)) {
      withTimeout(i);
    }

    System.out.println("withCompleteOnTimeout");
    for (AtomicInteger i = new AtomicInteger(0); i.get() < 100; i.addAndGet(1)) {
      withCompleteOnTimeout(i);
    }
  }
}
