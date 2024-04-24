package org.example;

import java.util.ArrayList;
import java.util.List;

public class Leaders extends Employee implements IEmployee {

  private List<IEmployee> reportingEmployees;

  public Leaders(String id, String name, String designation, List<IEmployee> employees) {
    super(id, name, designation);
    this.reportingEmployees = new ArrayList<>();
    this.reportingEmployees.addAll(employees);
  }

  @Override
  public void printDetails() {
    super.printDetails();
    reportingEmployees.stream().forEach(IEmployee::printDetails);
  }

  @Override
  public IEmployee searchEmployee(String id) {
    if (this.getId().equals(id)) {
      return this;
    }

    IEmployee e = null;
    for (IEmployee emp: reportingEmployees) {
      e = emp.searchEmployee(id);
    }

    return e;
  }
}
