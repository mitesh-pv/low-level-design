package org.example.service.pricing;

import org.example.entity.Ticket;

public interface PricingStrategy {
  double computePrice(Ticket ticket);
}
