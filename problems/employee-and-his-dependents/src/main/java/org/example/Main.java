package org.example;

import java.util.Arrays;

/**
 * Design a system which stores employee and their dependants info i.e a employees family info.
 * The system should be able to return the whole family's data when provided with an employee id or even a dependant id.
 */

public class Main {

  public static void main(String[] args) {

    IEmployee engineer = new Employee("4", "Sean", "Engineer");
    IEmployee manager = new Leaders("2", "Peter", "Manager", Arrays.asList(engineer));
    IEmployee directory = new Leaders("1", "Elon", "Director", Arrays.asList(manager));

    directory.printDetails();

    IEmployee searchEmployee = directory.searchEmployee("2");
    System.out.println(searchEmployee);

    System.out.println("Dependents of Peter");
    searchEmployee.printDetails();
  }
}