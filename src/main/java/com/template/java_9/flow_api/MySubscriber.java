package com.template.java_9.flow_api;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;

public class MySubscriber<T> implements Flow.Subscriber<T> {

  private Flow.Subscription subscription;

  @Override
  public void onSubscribe(Subscription subscription) {
    this.subscription = subscription;
    this.subscription.request(1);
  }

  @Override
  public void onNext(T item) {
    System.out.println(item);
    subscription.request(1);
  }

  @Override
  public void onError(Throwable throwable) {
    throwable.printStackTrace();
  }

  @Override
  public void onComplete() {
    System.out.println("DONE");
  }
}
