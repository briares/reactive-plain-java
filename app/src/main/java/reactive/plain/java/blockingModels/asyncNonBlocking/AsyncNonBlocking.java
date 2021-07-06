package reactive.plain.java.blockingModels.asyncNonBlocking;

import java.util.concurrent.CompletableFuture;

public class AsyncNonBlocking {
  public static void main(String[] args) throws InterruptedException {
    new AsyncNonBlocking().testSupplyAsync();

    Thread.sleep(3000);
    System.out.println("main thread finished");
  }


  public void testSupplyAsync() {
    CompletableFuture.supplyAsync(this::getInLongRunningProcess) // separate thread
        .thenApply(r -> "Result: " + r)
        .thenApply(String::toUpperCase)
        .thenAcceptAsync(System.out::println);
    System.out.println ("done -> testSupplyAsync");
  }

  public String getInLongRunningProcess() {
    try {
      // long time operation
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return "done -> getInLongRunningProcess";
  }

}
