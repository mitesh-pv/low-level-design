package org.example;

import org.example.model.GPU;
import org.example.model.Monitor;
import org.example.service.ASUSManufacturer;
import org.example.service.ComputerManufacturer;
import org.example.service.MSIManufacturer;

public class Main {

  public static void main(String[] args) {
    ComputerManufacturer manufacturer = new ASUSManufacturer();
    GPU asusGPU = manufacturer.orderGPU();

    ComputerManufacturer msiManufacturer = new MSIManufacturer();
    Monitor msiMonitor = msiManufacturer.orderMonitor();
  }
}