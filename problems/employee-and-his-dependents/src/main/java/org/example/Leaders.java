package org.example;

import java.util.ArrayList;
import java.util.List;

public class Leaders extends Employee implements IEmployee {

  private List<IEmployee> reportingEmployees;

  public Leaders(String id, String name, String designation, String department, List<IEmployee> employees) {
    super(id, name, designation, department);
    this.reportingEmployees = new ArrayList<>();
    this.reportingEmployees.addAll(employees);
  }

  @Override
  public void printDetails() {
    super.printDetails();
    reportingEmployees.stream().forEach(IEmployee::printDetails);
  }

  @Override
  public IEmployee searchEmployeeById(String id) {
    if (this.getId().equals(id)) {
      return this;
    }

    IEmployee e = null;
    for (IEmployee emp: reportingEmployees) {
      e = emp.searchEmployeeById(id);
    }

    return e;
  }

  @Override
  public IEmployee searchEmployeeHierarchyByDepartment(String department) {
    if (this.getDepartment().equals(department)) {
      return this;
    }

    IEmployee iEmployee = null;
    for (IEmployee e: reportingEmployees) {
      iEmployee = e.searchEmployeeHierarchyByDepartment(department);
    }

    return iEmployee;
  }
}
