package org.example.relations;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.Seat;
import org.example.model.Show;

@Getter
@Setter
@NoArgsConstructor
public class Booking {
  private int id;
  private Show show;
  private List<Seat> seatsBooked;

  public Booking(int id, Show show) {
    this.id = id;
    this.show = show;
    this.seatsBooked = new ArrayList<>();
  }

}
