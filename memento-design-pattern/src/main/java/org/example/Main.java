package org.example;

import org.example.caretaker.Editor;
import org.example.originator.TextArea;

public class Main {

  public static void main(String[] args) {
    Editor editor = new Editor();
    editor.write("first text");
    editor.write("second text");

    editor.undo();
    editor.undo();
  }
}