package com.thoughtworks.movierental;

public class Rental {

  public static final int ADDED_ON_RENTER_POINTS = 2;
  public static final int DEFAULT_RENTER_POINTS = 1;
  private int daysRented;
  private Movie movie;

  public Rental(Movie movie, int daysRented){
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public int getDaysRented() {
    return daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  public double amount() {
    double amount = 0;
    switch (movie.getPriceCode()) {
      case Movie.REGULAR:
        amount += 2;
        if (daysRented > 2)
          amount += (daysRented - 2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        amount += daysRented * 3;
        break;
      case Movie.CHILDRENS:
        amount += 1.5;
        if (daysRented > 3)
          amount += (daysRented - 3) * 1.5;
        break;
    }
    return amount;
  }

  public int frequentRenterPoints() {
    if (isAddOnPointsApplicable())
      return ADDED_ON_RENTER_POINTS;
    return DEFAULT_RENTER_POINTS;
  }

  private boolean isAddOnPointsApplicable() {
    return movie.isNewRelease() && daysRented > 1;
  }
}