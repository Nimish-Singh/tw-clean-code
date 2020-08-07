package com.thoughtworks.movierental;

public class Rental {

  private int daysRented;
  private Movie movie;

  public Rental(Movie movie, int daysRented){
    this.movie = movie;
    this.daysRented = daysRented;
  }

  Movie getMovie() {
    return movie;
  }

  public double amount() {
    return movie.priceCode().amountFor(daysRented);
  }

  int frequentRenterPoints() {
    return movie.priceCode().frequentRenterPoints(daysRented);
  }
}
