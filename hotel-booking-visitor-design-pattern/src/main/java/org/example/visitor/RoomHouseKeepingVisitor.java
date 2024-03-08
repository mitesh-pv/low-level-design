package org.example.visitor;

import org.example.element.DeluxeRoomElement;
import org.example.element.DoubleRoomElement;
import org.example.element.SingleRoomElement;

public class RoomHouseKeepingVisitor extends RoomVisitor {

  @Override
  public void visit(SingleRoomElement roomElement) {
    System.out.println("House keeping done on " + roomElement.getRoomNumber());
  }

  @Override
  public void visit(DoubleRoomElement roomElement) {
    System.out.println("House keeping done on " + roomElement.getRoomNumber());
  }

  @Override
  public void visit(DeluxeRoomElement roomElement) {
    System.out.println("House keeping done on " + roomElement.getRoomNumber());
  }
}
