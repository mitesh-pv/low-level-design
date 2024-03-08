package org.example.visitor;

import org.example.element.DeluxeRoomElement;
import org.example.element.DoubleRoomElement;
import org.example.element.RoomElement;
import org.example.element.SingleRoomElement;

public abstract class RoomVisitor {
  public abstract void  visit(SingleRoomElement roomElement);
  public abstract void visit(DoubleRoomElement roomElement);
  public abstract void visit(DeluxeRoomElement roomElement);
}
