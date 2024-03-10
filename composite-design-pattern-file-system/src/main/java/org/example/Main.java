package org.example;

import java.util.Arrays;
import org.example.component.Directory;
import org.example.component.File;
import org.example.component.FileSystem;

public class Main {

  public static void main(String[] args) {
    FileSystem directory = new Directory("Companies", Arrays.asList(
        new Directory("Microsoft", Arrays.asList(new File("ms-1"), new File("ms-2"))),
        new Directory("Google", Arrays.asList(new File("ggle-1"), new File("ggle-2"))),
        new File("resumeFile")
    ));

    directory.listDir();
  }
}