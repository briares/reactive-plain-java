package reactive.plain.java.blockingModels.reactiveStreams;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class CustomFootballerSubscriber implements Subscriber<Footballer> {
  private Subscription subscription;
  private int counter = 0;

  @Override
  public void onSubscribe(Subscription subscription) {
    System.out.println("onSubscribe for CustomFootballerSubscriber called");
    this.subscription = subscription;
    this.subscription.request(1); //requesting data from publisher
    System.out.println("onSubscribe for CustomFootballerSubscriber requested 1 footballer");
  }

  @Override
  public void onNext(Footballer footballer) {
    System.out.println("Processing Footballer " + footballer);
    counter++;
    this.subscription.request(1);
  }

  @Override
  public void onError(Throwable e) {
    System.out.println("Some error happened");
    e.printStackTrace();
  }

  @Override
  public void onComplete() {
    System.out.println("All Processing Done");
  }

  public int getCounter() {
    return counter;
  }
}
