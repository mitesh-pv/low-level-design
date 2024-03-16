package org.example;

import org.example.singleton.Logger;

public class Main {
  public static void main(String[] args) throws NoSuchMethodException {
    Logger logger = Logger.getInstance();

    logger.info("This is info log");
    logger.error("This is error log");
    logger.debug("This is debug log");

    // Now to incorporate the LogNamespace, ther is a class called LogModel,
    // change the Logger singleton class getInstance method to accept the LogModel
    // we'll pass the LogModel with current class name and current method name
    // the corresponding info, error and debug logs will be taking this model and print the
    // class and method name also
  }
}