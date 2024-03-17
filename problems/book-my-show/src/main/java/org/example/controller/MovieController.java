package org.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.example.model.City;
import org.example.model.Movie;

@Getter
@Setter
public class MovieController {
  private Map<City, List<Movie>> cityToMoviesMap;

  public MovieController() {
    cityToMoviesMap = new HashMap<>();
  }

  public List<Movie> getMoviesByCity(City city) {
    return cityToMoviesMap.get(city);
  }

}
