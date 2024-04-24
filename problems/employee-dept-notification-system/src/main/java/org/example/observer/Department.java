package org.example.observer;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Observer {
  private String deptId;
  private String deptName;
  private List<Employee> employeeList;
  private Employee manager;

  @Override
  public void notify(String message) {

  }
}
