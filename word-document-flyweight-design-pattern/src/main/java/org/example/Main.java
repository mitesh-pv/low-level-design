package org.example;

import org.example.fluweight.Char;

public class Main {

  public static void main(String[] args) {
    Char newChar = DocumentCharFactory.getChar('t');
    newChar.show(0, 0);

    newChar = DocumentCharFactory.getChar('h');
    newChar.show(0, 1);

    newChar = DocumentCharFactory.getChar('i');
    newChar.show(0, 2);

    newChar = DocumentCharFactory.getChar('s');
    newChar.show(0, 3);
  }
}