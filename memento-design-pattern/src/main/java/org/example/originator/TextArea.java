package org.example.originator;


public class TextArea {
  private String text;

  public TextArea(String text) {
    this.text = text;
  }

  public TextArea() {
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "TextArea{" +
        "text='" + text + '\'' +
        '}';
  }

  public Memento getSnapshot() {
    return new Memento(this.text);
  }

   public void restore(Memento memento) {
    this.text = memento.getSavedText();
   }

  public static class Memento {
    private String text;

    private Memento(String text) {
      this.text = text;
    }

    public String getSavedText() {
      return this.text;
    }
  }

}
