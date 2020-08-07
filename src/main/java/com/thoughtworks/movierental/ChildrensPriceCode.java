package com.thoughtworks.movierental;

public class ChildrensPriceCode implements PriceCode {
    private static final double FLAT_CHARGE = 1.5;
    private static final double CHARGE_PER_DAY = 1.5;

    public double amountFor(int daysRented) {
        double amount = FLAT_CHARGE;
        if (daysRented > 3)
            amount += (daysRented - 3) * CHARGE_PER_DAY;
        return amount;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return DEFAULT_RENTER_POINTS;
    }
}
