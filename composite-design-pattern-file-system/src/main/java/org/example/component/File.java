package org.example.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class File implements FileSystem{
  private String name;
  @Override
  public void listDir() {
    System.out.println("file -> " + name);
  }
}
