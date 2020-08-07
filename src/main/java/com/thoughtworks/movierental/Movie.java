package com.thoughtworks.movierental;

public class Movie {
  static final int CHILDRENS = 2;
  static final int REGULAR = 0;
  static final int NEW_RELEASE = 1;
  static final int BLU_RAY = 3;

  private String title;
  private int priceCode;

  public Movie(String title, int priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

  String getTitle() {
    return title;
  }

  PriceCode priceCode() {
    switch (priceCode) {
      case REGULAR: return new RegularPriceCode();
      case NEW_RELEASE: return new NewReleasePriceCode();
      case CHILDRENS: return new ChildrensPriceCode();
      case BLU_RAY: return new BluRayPriceCode();
      default: return new DefaultPriceCode();
    }
  }
}
