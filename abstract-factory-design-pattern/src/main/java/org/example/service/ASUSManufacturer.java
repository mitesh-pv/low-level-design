package org.example.service;

import org.example.model.ASUSGpu;
import org.example.model.ASUSMonitor;
import org.example.model.GPU;
import org.example.model.Monitor;

public class ASUSManufacturer extends ComputerManufacturer {

  @Override
  protected Monitor createMonitor() {
    return new ASUSMonitor();
  }

  @Override
  protected GPU createGPU() {
    return new ASUSGpu();
  }
}
