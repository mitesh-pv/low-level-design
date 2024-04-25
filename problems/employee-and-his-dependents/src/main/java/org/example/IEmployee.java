package org.example;

public interface IEmployee {
  void printDetails();

  IEmployee searchEmployeeById(String id);
  default  IEmployee searchEmployeeHierarchyByDepartment(String department) {
    System.out.println("implementation unavailable");
    return null;
  }
}
