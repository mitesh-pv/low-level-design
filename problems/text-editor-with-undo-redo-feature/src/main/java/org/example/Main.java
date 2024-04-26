package org.example;

import org.example.memento.TextEditor;

public class Main {

  public static void main(String[] args) {
    TextEditor textEditor = new TextEditor();

    textEditor.write("I");
    textEditor.write("I am");
    textEditor.write("I am engineer");

    System.out.println();
    textEditor.undo();
    textEditor.undo();
    textEditor.redo();
    textEditor.redo();
    textEditor.redo();
    textEditor.redo();
    textEditor.redo();
    textEditor.undo();

  }
}