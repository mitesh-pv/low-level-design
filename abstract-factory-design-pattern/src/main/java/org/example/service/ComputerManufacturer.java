package org.example.service;

import org.example.model.GPU;
import org.example.model.Monitor;

public abstract class ComputerManufacturer {
  public Monitor orderMonitor() {
    Monitor monitor = createMonitor();
    monitor.assemble();
    return monitor;
  }

  public GPU orderGPU() {
    GPU gpu = createGPU();
    gpu.assemble();
    return gpu;
  }

  protected abstract Monitor createMonitor();
  protected abstract GPU createGPU();
}
