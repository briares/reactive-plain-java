package reactive.plain.java.blockingModels.reactiveStreams;

import java.util.ArrayList;
import java.util.List;

public class FoorballerHelper {

  public static List<Footballer> getStudents() {

    Footballer messi = Footballer.builder().id(1).name("Messi").build();
    Footballer busquets = Footballer.builder().id(2).name("Busquets").build();
    Footballer pedri = Footballer.builder().id(3).name("Pedri").build();
    Footballer sergiRoberto = Footballer.builder().id(4).name("Sergi Roberto").build();
    Footballer pique = Footballer.builder().id(5).name("Pique").build();
    Footballer amunike = Footballer.builder().id(6).name("Amunike").build();
    List<Footballer> footballerList = new ArrayList<>();
    footballerList.add(messi);
    footballerList.add(busquets);
    footballerList.add(pedri);
    footballerList.add(sergiRoberto);
    footballerList.add(pique);
    footballerList.add(amunike);

    return footballerList;
  }
}