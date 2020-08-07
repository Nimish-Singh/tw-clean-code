package com.thoughtworks.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HtmlStatementTest {
    @Test
    public void shouldReturnHtmlStatement() {
        Rentals rentals = new Rentals();
        rentals.add(new Rental(new Movie("title", Movie.REGULAR), 3));
        HtmlStatement htmlStatement = new HtmlStatement("name", rentals);
        String expectedHtmlStatement = "<h1>Rental Record for <b>name</b></h1>title 3.5<br />Amount owed is "+
                "<b>3.5</b><br />You earned <b>1</b> frequent renter points";

        assertEquals(expectedHtmlStatement, htmlStatement.htmlStatement());
    }
}
