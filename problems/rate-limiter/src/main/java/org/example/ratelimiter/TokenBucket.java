package org.example.ratelimiter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket implements RateLimiter {
  private int capacity;
  private AtomicInteger currentCapacity;
  private AtomicLong lastUpdateTime;
  private int refreshRate;

  public TokenBucket(int capacity, int refreshRate) {
    this.capacity = capacity;
    this.refreshRate = refreshRate;
    this.currentCapacity = new AtomicInteger(capacity);
    this.lastUpdateTime = new AtomicLong(System.currentTimeMillis());
  }

  @Override
  public boolean isAllow() {
    refreshBucket();
    if (currentCapacity.get() > 0) {
      currentCapacity.decrementAndGet();
      return true;
    }

    return false;
  }

  private void refreshBucket() {
    long currentTime = System.currentTimeMillis();
    int additionalToken = (int) (currentTime - lastUpdateTime.get()) / 1000 * refreshRate;
    int newCapacity = additionalToken + currentCapacity.get();

    currentCapacity.getAndSet(newCapacity);
    lastUpdateTime.set(currentTime);
  }
}
