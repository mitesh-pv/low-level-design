package org.example;

import org.example.localutil.CustomHashMap;

public class Main {

  public static void main(String[] args) {
    CustomHashMap<Integer, Character> map = new CustomHashMap<>();
    map.put(4, 'A');
    map.put(5, 'A');
    map.put(5, 'B');
    map.put(7, 'C');

    System.out.println(map.getValue(4));
  }
}