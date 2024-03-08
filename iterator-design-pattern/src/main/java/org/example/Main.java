package org.example;

import java.util.Arrays;
import java.util.List;
import org.example.aggregate.Library;
import org.example.iterator.Iterator;
import org.example.model.Book;

public class Main {

  public static void main(String[] args) {
    List<Book> books = Arrays.asList(new Book("Book_1", 100), new Book("Book_2", 200));

    Library library = new Library(books);
    Iterator itr = library.createIterator();

    while(itr.hasNext()) {
      Book nextBook = (Book) itr.next();
      System.out.printf(nextBook.toString());
    }
  }
}