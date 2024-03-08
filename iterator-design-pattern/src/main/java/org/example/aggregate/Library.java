package org.example.aggregate;

import java.util.List;
import org.example.iterator.BookIterator;
import org.example.iterator.Iterator;
import org.example.model.Book;

public class Library implements Aggregate {
  private List<Book> books;

  public Library(List<Book> books) {
    this.books = books;
  }

  @Override
  public Iterator createIterator() {
    return new BookIterator(books);
  }
}
