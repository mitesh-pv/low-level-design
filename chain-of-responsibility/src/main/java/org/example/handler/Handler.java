package org.example.handler;

public abstract class Handler {
  private Handler next;

  public void setNextHandler(Handler next) {
    this.next = next;
  }

  public abstract boolean handle(String username, String password);

  protected boolean handleNext(String username, String password) {
    if(null == next) return true;
    return next.handle(username, password);
  }

}
