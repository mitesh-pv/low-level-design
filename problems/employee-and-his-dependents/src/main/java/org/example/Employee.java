package org.example;

import lombok.Data;

@Data
public class Employee implements IEmployee {
  protected String id;
  protected String name;
  protected String designation;
  protected String department;

  public Employee(String id, String name, String designation, String department) {
    this.id = id;
    this.name = name;
    this.designation = designation;
    this.department = department;
  }

  @Override
  public void printDetails() {
    System.out.println(id + " - " + name + " - " + department);
  }

  @Override
  public IEmployee searchEmployeeById(String id) {
    if (this.id.equals(id)) {
      return this;
    }

    return null;
  }
}
