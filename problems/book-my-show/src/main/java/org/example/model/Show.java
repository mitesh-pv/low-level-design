package org.example.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {
  private int id;
  private Movie movie;
  private Screen screen;
  private int startTime;
  private List<String> bookedSeats;
}
