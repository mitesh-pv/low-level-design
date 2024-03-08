package org.example.service;

import org.example.model.GPU;
import org.example.model.MSIGpu;
import org.example.model.MSIMonitor;
import org.example.model.Monitor;

public class MSIManufacturer extends ComputerManufacturer {

  @Override
  protected Monitor createMonitor() {
    return new MSIMonitor();
  }

  @Override
  protected GPU createGPU() {
    return new MSIGpu();
  }
}
