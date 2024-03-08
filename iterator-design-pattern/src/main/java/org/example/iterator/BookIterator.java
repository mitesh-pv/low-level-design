package org.example.iterator;

import java.util.List;
import org.example.model.Book;

public class BookIterator implements Iterator {
  private List<Book> books;
  private int index;

  public BookIterator(List<Book> books) {
    this.books = books;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    return index < books.size();
  }

  @Override
  public Object next() {
    if(index < books.size()) return books.get(index++);

    return null;
  }
}
