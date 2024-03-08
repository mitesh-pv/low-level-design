package org.example.observable;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.example.observer.Observer;

@Data
public class IPhoneObservable implements Subject {
  private List<Observer> observerList;

  private int stockQuantity;
  private String name;

  public IPhoneObservable(String name) {
    this.observerList = new ArrayList<>();
    this.stockQuantity = 0;
    this.name = name;
  }

  @Override
  public void registerObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observerList.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observerList.stream().forEach(observer -> observer.update());
  }

  @Override
  public void setData(int stockQuantity) {
    if(this.getStockQuantity() == 0) notifyObservers();

    this.setStockQuantity(stockQuantity);
  }

  @Override
  public String getData() {
    return this.name;
  }
}
