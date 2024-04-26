package org.example.memento;

import org.example.memento.TextArea.Memento;

class TextAreaListNode {
  Memento memento;
  TextAreaListNode left;
  TextAreaListNode right;

  public TextAreaListNode() {
  }

}

public class TextEditor {
  private TextAreaListNode head;
  private TextAreaListNode tail;
  private TextAreaListNode top;
  private TextArea textArea;

  public TextEditor() {
    this.head = new TextAreaListNode();
    this.tail = new TextAreaListNode();
    this.top = head;

    this.textArea = new TextArea();

    this.head.right = tail;
    this.tail.left = head;
  }

  public void write(String text){
    textArea.setText(text);
    addSnapshotToTop(textArea.takeSnapshot());

    System.out.println(textArea);
  }

  public void undo() {
    moveTopToLeft();
    if (top != head) textArea.restore(top.memento);


    System.out.println(textArea);
  }

  public void redo() {
    moveTopToRight();
    if (top != head) textArea.restore(top.memento);

    System.out.println(textArea);
  }

  private void addSnapshotToTop(Memento textAreaMemento) {
    TextAreaListNode node = new TextAreaListNode();
    node.memento = textAreaMemento;

    top.right = node;
    node.left = top;

    tail.left = node;
    node.right = tail;

    top = node;
  }

  private void moveTopToLeft() {
    if (top == head) {
      return;
    }

    top = top.left;
  }

  private void moveTopToRight() {
    if (top == head || top.right == tail) {
      return;
    }

    top = top.right;
  }
}
