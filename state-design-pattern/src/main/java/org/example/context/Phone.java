package org.example.context;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.state.State;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
  private State state;

  public String lock() {
    return "Phone locked";
  }

  public String unlock() {
    return "Phone unlocked";
  }

  public String onHome() {
    return "Phone on home screen";
  }

  public String turnOn() {
    return "phone turning on";
  }
}
