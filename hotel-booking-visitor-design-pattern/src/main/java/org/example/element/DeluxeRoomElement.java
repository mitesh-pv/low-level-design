package org.example.element;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.visitor.RoomVisitor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeluxeRoomElement implements RoomElement {
  private String roomNumber;
  private double price;
  @Override
  public void accept(RoomVisitor visitor) {
    visitor.visit(this);
  }
}
