package reactive.plain.java.blockingModels.reactiveStreams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@AllArgsConstructor
@ToString
public class Footballer {
  int id;
  String name;
}