package org.example.memento;


public class TextArea {
  private String text;

  public TextArea() {
  }

  public void setText(String text) {
    this.text = text;
  }

  public Memento takeSnapshot() {
    return new Memento(this.text);
  }

  @Override
  public String toString() {
    return text;
  }

  public void restore(Memento memento) {
    this.text = memento.getText();
  }

  public static class Memento {
    private final String text;

    private Memento(String text) {
      this.text = text;
    }

    private String getText() {
      return this.text;
    }
  }

}
