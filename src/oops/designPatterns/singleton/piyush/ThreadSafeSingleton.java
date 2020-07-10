package oops.designPatterns.singleton.piyush;

public class ThreadSafeSingleton {
  private ThreadSafeSingleton instance;

  private ThreadSafeSingleton() {}

  public ThreadSafeSingleton getInstance() {
    ThreadSafeSingleton obj = instance;
    if (obj == null) {
      synchronized (this) {
        obj = instance;
        if (obj == null) {
          obj = instance = new ThreadSafeSingleton();
        }
      }
    }
    return obj;
  }
}
