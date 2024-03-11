package org.example;

import java.util.HashMap;
import java.util.Map;
import org.example.fluweight.Char;
import org.example.fluweight.DocumentChar;

public class DocumentCharFactory {
  private static Map<Character, Char> charMap;

  static {
    charMap = new HashMap<>();
  }

  public static Char getChar(char charValue) {
    if(!charMap.containsKey(charValue)) {
      charMap.put(charValue, new DocumentChar(charValue, 10, "Arial"));
    }

    return charMap.get(charValue);
  }
}
