package com.thoughtworks.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {
    @Test
    public void shouldReturnAmountForBluRayMovieRental() {
        Movie bluRayMovie = new Movie("Some movie", 3);
        Rental rental = new Rental(bluRayMovie, 4);

        assertEquals(16, rental.amount(), 0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForBluRayMovieRental() {
        Movie bluRayMovie = new Movie("Some movie", 3);
        Rental rental = new Rental(bluRayMovie, 4);

        assertEquals(3, rental.frequentRenterPoints());
    }
}
