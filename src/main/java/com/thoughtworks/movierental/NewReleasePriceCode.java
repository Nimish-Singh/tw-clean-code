package com.thoughtworks.movierental;

public class NewReleasePriceCode implements PriceCode {
    private static final int BONUS_RENTER_POINTS = 2;
    private static final int CHARGE_PER_DAY = 3;

    public double amountFor(int daysRented) {
        return daysRented * CHARGE_PER_DAY;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        if (daysRented > 1) {
            return BONUS_RENTER_POINTS;
        }
        return DEFAULT_RENTER_POINTS;
    }
}
