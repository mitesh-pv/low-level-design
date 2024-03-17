package org.example;

import static org.example.model.Category.CLASSIC;
import static org.example.model.Category.GOLD;
import static org.example.model.Category.SILVER;
import static org.example.model.City.BANGALORE;
import static org.example.model.City.MUMBAI;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.controller.MovieController;
import org.example.controller.TheatreController;
import org.example.model.City;
import org.example.model.Movie;
import org.example.model.Screen;
import org.example.model.Seat;
import org.example.model.Show;
import org.example.model.Theatre;
import org.example.relations.Booking;

public class Main {

  private MovieController movieController;
  private TheatreController theatreController;

  public static void main(String[] args) {
    Main application = new Main();

    application.loadData();

    // Create new Booking
    application.createBooking(BANGALORE, "Top Gun");

    application.createBooking(BANGALORE, "Top Gun");

  }

  public void createBooking(City city, String movieName) {
    // check if movie is present in selected city
    boolean isAvailable = movieController.getMoviesByCity(city).stream()
        .anyMatch(movie -> movie.getName().equals(movieName));

    if(!isAvailable) {
      System.out.println("Movie not available in the current city");
      return;
    }

    // Select the Theatre
    List<Theatre> theatres = theatreController.getTheatreByCityAndMovie(city, movieName);
    if(theatres.isEmpty()) {
      System.out.println("movie not available in the given city ");
      return;
    }

    // select show
    List<Show> shows = theatreController.getShowsByMovieAndTheatre(theatres.get(0).getId(),
        movieName);
    if(shows.isEmpty()) {
      System.out.println("Shows not available");
      return;
    }

    Show show = shows.get(0);
    String seatNo = "1A";
    if(show.getBookedSeats().contains("1A")) {
      System.out.println("Seat no " + seatNo + " is already booked");
      return;
    }

    show.getBookedSeats().add(seatNo);
    Booking myBooking = new Booking();
    myBooking.setId(1);
    myBooking.setShow(show);
    List<Seat> myBookedSeats = new ArrayList<>();
    for(Seat seats: show.getScreen().getSeats()) {
      if(seats.getSeatId().equals(seatNo)) {
        myBookedSeats.add(seats);
      }
    }
    myBooking.setSeatsBooked(myBookedSeats);

    System.out.println("Booking Successful");
  }

  private void loadData() {
    this.movieController = new MovieController();
    this.theatreController = new TheatreController();

    createCityToMovieMap(this.movieController);
    createCityToTheatreMap(this.theatreController);
  }

  private void createCityToMovieMap(MovieController movieController) {
    List<Movie> movies = getMovies();

    // City - Movie
    for(Movie movie: movies) {
      movieController.getCityToMoviesMap().put(BANGALORE, new ArrayList<>(movies));
      movieController.getCityToMoviesMap().put(MUMBAI, new ArrayList<>(movies));
    }
  }

  private void createCityToTheatreMap(TheatreController theatreController) {
    theatreController.getCityTheatreMap().put(BANGALORE, new ArrayList<>());
    theatreController.getCityTheatreMap().put(MUMBAI, new ArrayList<>());

    List<Movie> movies = getMovies();

    // Theatre-1 in Bangalore
    List<Seat> seats = getSeats();
    Screen screen1 = new Screen(1, new ArrayList<>(seats));
    Show show1 = new Show(1, movies.get(0), screen1, 20, new ArrayList<>());

    Screen screen2 = new Screen(2, new ArrayList<>(seats));
    Show show2 = new Show(2, movies.get(1), screen2, 4, new ArrayList<>());

    List<Show> shows = new ArrayList<>();
    shows.add(show1);
    shows.add(show2);

    Theatre theatre1 = new Theatre(1, "Bangalore - 1", new ArrayList(shows));
    theatreController.getCityTheatreMap().get(BANGALORE).add(theatre1);

    // Theatres-2 in Bangalore
    Screen screen21 = new Screen(3, new ArrayList<>(seats));
    Show show21 = new Show(4, movies.get(0), screen21, 3, new ArrayList<>());

    Screen screen22 = new Screen(5, new ArrayList<>(seats));
    Show show22 = new Show(6, movies.get(1), screen22, 9, new ArrayList<>());

    List<Show> shows2 = new ArrayList<>();
    shows2.add(show21);
    shows2.add(show22);

    Theatre theatre2 = new Theatre(2, "Bangalore - 2", new ArrayList(shows2));
    theatreController.getCityTheatreMap().get(BANGALORE).add(theatre2);

    // Theatre-1 in Mumbai
    Screen screen31 = new Screen(7, new ArrayList<>(seats));
    Show show31 = new Show(8, movies.get(0), screen31, 20, new ArrayList<>());

    Screen screen32 = new Screen(9, new ArrayList<>(seats));
    Show show32 = new Show(10, movies.get(1), screen32, 4, new ArrayList<>());

    List<Show> shows3 = new ArrayList<>();
    shows3.add(show31);
    shows3.add(show32);

    Theatre theatre3 = new Theatre(3, "Mumbai - 1", new ArrayList<>(shows3));
    theatreController.getCityTheatreMap().get(MUMBAI).add(theatre3);
  }

  private List<Seat> getSeats() {
    List<Seat> seats = new ArrayList<>();
    for(int i=1; i<2; ++i) {
      seats.add(new Seat(i + "A", 'A', CLASSIC, 150));
      seats.add(new Seat(i + "B", 'B', CLASSIC, 150));
      seats.add(new Seat(i + "C", 'C', CLASSIC, 150));
      seats.add(new Seat(i + "D", 'D', CLASSIC, 150));
    }

    for(int i=1; i<2; ++i) {
      seats.add(new Seat(i + "E", 'E', SILVER, 200));
      seats.add(new Seat(i + "F", 'G', SILVER, 200));
    }

    for(int i=1; i<2; ++i) {
      seats.add(new Seat(i + "G", 'G', GOLD, 300));
      seats.add(new Seat(i + "H", 'H', GOLD, 300));
    }

    return seats;
  }

  private List<Movie> getMovies() {
    Movie movie1 = new Movie(1, "Top Gun", 180);
    Movie movie2 = new Movie(2, "Avengers", 140);

    return List.of(movie1, movie2);
  }

}