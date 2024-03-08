package org.example.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.context.Phone;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class State {
  protected Phone phone;

  public abstract void onHome();
  public abstract void onPowerOnOff();
}
