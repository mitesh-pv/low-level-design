package org.example.localutil;

public class CustomHashMap <K, V> {
  private final int SIZE = 7;
  private Entry[] hash;

  public CustomHashMap() {
    this.hash = new Entry[SIZE];
  }

  public void put(K key, V value) {
    int hashKey = key.hashCode() % this.hash.length;

    if(hash[hashKey] == null) {
      Entry<K, V> entry = new Entry<>(key, value);
      hash[hashKey] = entry;
    } else {
      Entry node = hash[hashKey];
      Entry prevNode = null;

      while(node != null) {
        if(node.key == key) {
          node.value = value;
          return;
        }

        prevNode = node;
        node = node.next;
      }

      prevNode.next= new Entry(key, value);
    }
  }
  public V getValue(K key) {
    int hashKey = key.hashCode() % hash.length;

    Entry<K, V> node =  hash[hashKey];
    while(node != null) {
      if(node.key == key) {
        return (V) node.value;
      }

      node = node.next;
    }

    return null;
  }

  class Entry <K, V> {
    private K key;
    private V value;
    private Entry next;

    Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }
}
