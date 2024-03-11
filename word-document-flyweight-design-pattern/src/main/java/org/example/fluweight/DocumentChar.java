package org.example.fluweight;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class DocumentChar implements Char {
  private char ch;
  private int fontSize;
  private String fontStyle;

  public DocumentChar(char ch, int fontSize, String fontStyle) {
    this.ch = ch;
    this.fontSize = fontSize;
    this.fontStyle = fontStyle;
  }

  @Override
  public void show(int x, int y) {
    System.out.print(this + " -> ");
    System.out.println(x + " : " + y);
  }
}
