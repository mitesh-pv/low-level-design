package org.example.element;

import org.example.visitor.RoomVisitor;

public interface RoomElement {
  void accept(RoomVisitor visitor);
}
