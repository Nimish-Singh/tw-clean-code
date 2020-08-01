package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

class Rentals extends ArrayList<Rental> {
    double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            totalAmount += rental.amount();
        }
        return totalAmount;
    }

    int totalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : this) {
            totalFrequentRenterPoints += rental.frequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }
}