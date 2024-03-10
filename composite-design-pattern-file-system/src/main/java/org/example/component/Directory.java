package org.example.component;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
  private String name;
  private List<FileSystem> fileSystemList;

  public Directory(String name, List<FileSystem> fileSystemList) {
    this.name = name;
    this.fileSystemList = new ArrayList<>();
    this.fileSystemList.addAll(fileSystemList);
  }

  @Override
  public void listDir() {
    System.out.println("Directory -> " + name);
    for(FileSystem fileSystem: fileSystemList) fileSystem.listDir();
    System.out.println();
  }
}
