package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.example.ratelimiter.BucketCreator;
import org.example.ratelimiter.LeakyBucket;
import org.example.ratelimiter.TokenBucket;

public class Main {

  public static void main(String[] args) {
    BucketCreator bucketCreator = new BucketCreator();

    ExecutorService executorService = Executors.newFixedThreadPool(12);

    for (int id = 1; id <= 12; ++id) {
      int finalId = id;
      executorService.execute(() -> bucketCreator.intercept(1, new TokenBucket(2, 1)));
    }

    executorService.shutdown();
  }
}