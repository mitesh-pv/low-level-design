package org.example.aggregate;

import org.example.iterator.Iterator;

public interface Aggregate {
  Iterator createIterator();
}
