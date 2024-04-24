package org.example.observer;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organisation implements Observer {
  private List<Department> departmentList;
  private Employee ceo;

  @Override
  public void notify(String message) {
  }
}
