package org.example.caretaker;

import java.util.Stack;
import org.example.originator.TextArea;
import org.example.originator.TextArea.Memento;

public class Editor {
  private TextArea textArea;
  private Stack<Memento> history;

  public Editor() {
    this.textArea = new TextArea();
    this.history = new Stack<>();
  }

  public void write(String text) {
    textArea.setText(text);
    history.push(textArea.getSnapshot());
    printTextArea();
  }

  public void undo() {
    textArea.restore(history.pop());
    printTextArea();
  }

  private void printTextArea() {
    System.out.println(textArea);
  }

}
