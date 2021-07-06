package reactive.plain.java.blockingModels.syncBlocking;

public class SynchronousBlocking {
  public static void main (String[] args) {
    MyCounter myCounter = new MyCounter();

    for (int i = 0; i < 100000; i++) {
      new Thread(() -> myCounter.add(1)).start();
    }

    System.out.println("Final count: " + myCounter.count);
  }

  public void blockingExample()  {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}


class MyCounter {
  public int count = 0;

  /*
  public synchronized  void add(int value){
    this.count += value;
  }
   */


  public void add(int value){
    this.count += value;
  }
}