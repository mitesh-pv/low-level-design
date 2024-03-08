package org.example;

import org.example.element.DeluxeRoomElement;
import org.example.element.DoubleRoomElement;
import org.example.element.RoomElement;
import org.example.element.SingleRoomElement;
import org.example.visitor.RoomHouseKeepingVisitor;
import org.example.visitor.RoomPricingVisitor;
import org.example.visitor.RoomVisitor;

public class Main {

  public static void main(String[] args) {
    RoomElement singleRoomElement = new SingleRoomElement("101A", 1000D);
    RoomElement doubleRoomElement = new DoubleRoomElement("102A", 2000D);
    RoomElement deluxeRoomElement = new DeluxeRoomElement("103A", 9000D);

    RoomVisitor pricingVisitor = new RoomPricingVisitor();
    singleRoomElement.accept(pricingVisitor);

    RoomVisitor houseKeepingVisitor = new RoomHouseKeepingVisitor();
    deluxeRoomElement.accept(houseKeepingVisitor);
  }
}