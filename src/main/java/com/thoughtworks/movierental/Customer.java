package com.thoughtworks.movierental;

public class Customer {
  public static final String RENTAL_RECORD_FOR = "Rental Record for ";
  public static final String AMOUNT_OWED_IS = "Amount owed is ";
  public static final String YOU_EARNED = "You earned ";
  public static final String FREQUENT_RENTER_POINTS = " frequent renter points";
  private final Rentals rentals = new Rentals();
  private String name;

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String statement() {
    return new TextStatement(name, rentals).textStatement();
  }

  public String htmlStatement() {
    return new HtmlStatement(name, rentals).htmlStatement();
  }
}

