package com.thoughtworks.movierental;

public class RegularPriceCode implements PriceCode {
    private static final int FLAT_CHARGE = 2;
    private static final double CHARGE_PER_DAY = 1.5;

    public double amountFor(int daysRented) {
        double amount = FLAT_CHARGE;
        if (daysRented > 2)
            amount += (daysRented - 2) * CHARGE_PER_DAY;
        return amount;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return DEFAULT_RENTER_POINTS;
    }
}
