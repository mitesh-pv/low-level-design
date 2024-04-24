package org.example;

import lombok.Data;

@Data
public class Employee implements IEmployee {
  private String id;
  private String name;
  private String department;

  public Employee(String id, String name, String department) {
    this.id = id;
    this.name = name;
    this.department = department;
  }

  @Override
  public void printDetails() {
    System.out.println(id + " - " + name + " - " + department);
  }

  @Override
  public IEmployee searchEmployee(String id) {
    if (this.id.equals(id)) {
      return this;
    }

    return null;
  }
}
