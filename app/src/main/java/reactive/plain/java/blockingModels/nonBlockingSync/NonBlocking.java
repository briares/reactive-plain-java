package reactive.plain.java.blockingModels.nonBlockingSync;

import java.util.concurrent.atomic.AtomicInteger;

public class NonBlocking {

  public static void main (String[] args) {
    AtomicInteger atomicInt = new AtomicInteger(0);

    boolean result = atomicInt.compareAndSet(1, 1);
    System.out.println("Final count: " + atomicInt.get() + " and result " + result);

    result = atomicInt.compareAndSet(0, 1);
    System.out.println("Final count: " + atomicInt.get() + " and result " + result);

  }

}

