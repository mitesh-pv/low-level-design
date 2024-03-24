package org.example.ratelimiter;

import java.util.HashMap;
import java.util.Map;

public class BucketCreator {
  private Map<Integer, RateLimiter> map;

  public BucketCreator() {
    map = new HashMap<>();
  }

  public void intercept(int id, RateLimiter rateLimiter) {
    if (!map.containsKey(id)) {
      map.put(id, rateLimiter);
    }

    if (!map.get(id).isAllow()) {
      System.out.println("Please try later");
      return;
    }

    System.out.println("Passing to application");
  }
}
