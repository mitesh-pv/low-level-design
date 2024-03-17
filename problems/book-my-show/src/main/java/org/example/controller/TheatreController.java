package org.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.example.model.City;
import org.example.model.Show;
import org.example.model.Theatre;

@Getter
@Setter
public class TheatreController {
  private Map<City, List<Theatre>> cityTheatreMap;
  private List<Theatre> theatres;

  public TheatreController() {
    cityTheatreMap = new HashMap<>();
    theatres = new ArrayList<>();
  }

  public List<Theatre> getTheatreByCity(City city) {
    return cityTheatreMap.get(city);
  }

  public List<Theatre> getTheatreByCityAndMovie(City city, String movie) {
    List<Theatre> theatres = new ArrayList<>();

    cityTheatreMap.get(city).stream().forEach(theatre -> {
      for(Show show: theatre.getShows()) {
        if(show.getMovie().getName().equals(movie)) {
          theatres.add(theatre);
        }
      }
    });

    return theatres;
  }

  public List<Show> getShowsByMovieAndTheatre(int id, String movie) {
    List<Show> shows = new ArrayList<>();

    for(List<Theatre> theatres: cityTheatreMap.values()) {
      for(Theatre theatre: theatres) {
        if(theatre.getId() == id) {
          for(Show show: theatre.getShows()) {
            if(show.getMovie().getName().equals(movie)) {
              shows.add(show);
            }
          }
        }
      }
    }

    return shows;
  }

}
