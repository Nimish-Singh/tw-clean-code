package com.thoughtworks.movierental;

public class DefaultPriceCode implements PriceCode {
    public double amountFor(int daysRented) {
        return 0;
    }
}
