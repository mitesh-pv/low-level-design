package org.example;

import java.util.Arrays;

/**
 * Design a system which stores employee and their dependants info i.e a employees family info.
 * The system should be able to return the whole family's data when provided with an employee id or even a dependant id.
 */

public class Main {

  public static void main(String[] args) {

    IEmployee engineer = new Employee("4", "Sean", "Engineer", "test");
    IEmployee manager = new Leaders("2", "Peter", "Manager", "test", Arrays.asList(engineer));
    IEmployee directory = new Leaders("1", "Elon", "Director", "management", Arrays.asList(manager));

    directory.printDetails();

    IEmployee searchEmployee = directory.searchEmployeeById("2");
    System.out.println(searchEmployee);
    System.out.println();

    System.out.println("Dependents of Peter");
    searchEmployee.printDetails();
    System.out.println();

    System.out.println("Employee family of test department");
    IEmployee searchEmpFamilyByDept = directory.searchEmployeeHierarchyByDepartment("test");
    searchEmpFamilyByDept.printDetails();
  }
}