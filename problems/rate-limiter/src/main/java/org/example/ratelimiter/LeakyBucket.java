package org.example.ratelimiter;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LeakyBucket implements RateLimiter {
  private BlockingQueue<Integer> queue;

  public LeakyBucket() {
    queue = new LinkedBlockingQueue<>(2);
  }

  @Override
  public boolean isAllow() {
    if (queue.remainingCapacity() > 0) {
      queue.add(1);
      return true;
    }

    System.out.println("Too Many requests Status code : 429");
    return false;
  }
}
