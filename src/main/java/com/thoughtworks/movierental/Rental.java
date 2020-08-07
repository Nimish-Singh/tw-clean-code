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

  public Movie getMovie() {
    return movie;
  }

  public double amount() {
    switch (movie.getPriceCode()) {
      case Movie.REGULAR: return new RegularPriceCode().amountFor(daysRented);
      case Movie.NEW_RELEASE: return new NewReleasePriceCode().amountFor(daysRented);
      case Movie.CHILDRENS: return new ChildrensPriceCode().amountFor(daysRented);
      default: return 0;
    }
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