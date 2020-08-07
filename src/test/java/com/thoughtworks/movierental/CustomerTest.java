package com.thoughtworks.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void shouldReturnTextStatement() {
        Customer customer = new Customer("John");
        Rental rental = new Rental(new Movie("Jurassic park", Movie.REGULAR), 3);
        Rental anotherRental = new Rental(new Movie("Jurassic park 2", Movie.NEW_RELEASE), 4);
        Rental oneMoreRental = new Rental(new Movie("Jurassic park 3", Movie.CHILDRENS), 5);
        customer.addRental(rental);
        customer.addRental(anotherRental);
        customer.addRental(oneMoreRental);

        String expectedOutput = "Rental Record for John\n" +
                "\tJurassic park\t3.5\n" +
                "\tJurassic park 2\t12.0\n" +
                "\tJurassic park 3\t4.5\n" +
                "Amount owed is 20.0\n" +
                "You earned 4 frequent renter points";

        String receivedStatement = customer.statement();

        assertEquals(expectedOutput, receivedStatement);
    }

    @Test
    public void shouldReturnTextStatementWhenBluRayMovieIsRented() {
        Customer customer = new Customer("John");
        Rental rental = new Rental(new Movie("Jurassic park", Movie.REGULAR), 3);
        Rental anotherRental = new Rental(new Movie("Jurassic park 2", Movie.NEW_RELEASE), 4);
        Rental oneMoreRental = new Rental(new Movie("Jurassic park 3", Movie.BLU_RAY), 5);
        customer.addRental(rental);
        customer.addRental(anotherRental);
        customer.addRental(oneMoreRental);

        String expectedOutput = "Rental Record for John\n" +
                "\tJurassic park\t3.5\n" +
                "\tJurassic park 2\t12.0\n" +
                "\tJurassic park 3\t20.0\n" +
                "Amount owed is 35.5\n" +
                "You earned 6 frequent renter points";

        String receivedStatement = customer.statement();

        assertEquals(expectedOutput, receivedStatement);
    }

    @Test
    public void shouldReturnHTMLStatement() {
        Customer customer = new Customer("John");
        Rental rental = new Rental(new Movie("Jurassic park", Movie.REGULAR), 3);
        Rental anotherRental = new Rental(new Movie("Jurassic park 2", Movie.NEW_RELEASE), 4);
        Rental oneMoreRental = new Rental(new Movie("Jurassic park 3", Movie.CHILDRENS), 5);
        customer.addRental(rental);
        customer.addRental(anotherRental);
        customer.addRental(oneMoreRental);

        String expectedOutput = "<h1>Rental Record for <b>John</b></h1>" +
                "Jurassic park 3.5<br />" +
                "Jurassic park 2 12.0<br />" +
                "Jurassic park 3 4.5<br />" +
                "Amount owed is <b>20.0</b><br />" +
                "You earned <b>4</b> frequent renter points";

        String receivedStatement = customer.htmlStatement();

        assertEquals(expectedOutput, receivedStatement);
    }

}
