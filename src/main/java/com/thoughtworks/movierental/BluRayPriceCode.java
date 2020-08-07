package com.thoughtworks.movierental;

public class BluRayPriceCode implements PriceCode {
    private static final int CHARGE_PER_DAY = 4;
    private static final int BLU_RAY_RENTER_POINTS = 3;

    @Override
    public double amountFor(int daysRented) {
        return daysRented * CHARGE_PER_DAY;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return BLU_RAY_RENTER_POINTS;
    }
}
