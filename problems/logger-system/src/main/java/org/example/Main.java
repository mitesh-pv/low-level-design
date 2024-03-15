package org.example;

import org.example.chain.DebugLogger;
import org.example.chain.ErrorLogger;
import org.example.chain.InfoLogger;
import org.example.chain.Logger;

public class Main {

  public static void main(String[] args) {
    Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

    logger.log(Logger.ERROR, "Error log");
    logger.log(Logger.INFO, "Info log");
    logger.log(Logger.DEBUG, "Debug log");
  }
}