package org.example.visitor;

import org.example.element.DeluxeRoomElement;
import org.example.element.DoubleRoomElement;
import org.example.element.SingleRoomElement;

public class RoomPricingVisitor extends RoomVisitor {

  @Override
  public void visit(SingleRoomElement roomElement) {
    System.out.println("Price for room no = " + roomElement.getRoomNumber() + " is = " + roomElement.getPrice());
  }

  @Override
  public void visit(DoubleRoomElement roomElement) {
    System.out.println("Price for room no = " + roomElement.getRoomNumber() + " is = " + roomElement.getPrice());
  }

  @Override
  public void visit(DeluxeRoomElement roomElement) {
    System.out.println("Price for room no = " + roomElement.getRoomNumber() + " is = " + roomElement.getPrice());
  }
}
