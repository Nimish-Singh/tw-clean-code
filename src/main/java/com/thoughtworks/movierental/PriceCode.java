package com.thoughtworks.movierental;

public interface PriceCode {
    int DEFAULT_RENTER_POINTS = 1;

    double amountFor(int daysRented);

    int frequentRenterPoints(int daysRented);
}
