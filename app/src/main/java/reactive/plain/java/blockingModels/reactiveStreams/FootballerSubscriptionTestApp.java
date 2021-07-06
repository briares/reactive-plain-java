package reactive.plain.java.blockingModels.reactiveStreams;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class FootballerSubscriptionTestApp {
  public static void main(String[] args) throws InterruptedException {

    // Create Publisher
    SubmissionPublisher<Footballer> publisher = new SubmissionPublisher<Footballer>();

    // Register Subscriber
    CustomFootballerSubscriber subs = new CustomFootballerSubscriber();
    publisher.subscribe(subs);

    List<Footballer> students = FoorballerHelper.getStudents();

    // Publish items
    System.out.println("Publishing Items to Subscriber");
    students.forEach(publisher::submit);

    // logic to wait till processing of all messages are over
    while (students.size() != subs.getCounter()) {
      Thread.sleep(10);
    }

    // close the Publisher
    publisher.close();

    System.out.println("Exiting the app");

  }
}
