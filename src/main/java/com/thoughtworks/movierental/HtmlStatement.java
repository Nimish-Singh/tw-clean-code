package com.thoughtworks.movierental;

public class HtmlStatement {
    private final String name;
    private final Rentals rentals;


    public HtmlStatement(String name, Rentals rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    String htmlStatement() {
        return htmlHeader() + htmlBody() + htmlFooter();
    }

    private String htmlFooter() {
        return Customer.AMOUNT_OWED_IS + "<b>" + String.valueOf(rentals.totalAmount()) + "</b><br />"
                + Customer.YOU_EARNED + "<b>" + String.valueOf(rentals.totalFrequentRenterPoints()) + "</b>" + Customer.FREQUENT_RENTER_POINTS;
    }

    private String htmlHeader() {
        return "<h1>" + Customer.RENTAL_RECORD_FOR + "<b>" + name + "</b></h1>";
    }

    private String htmlBody() {
        String statement = "";
        for (Rental rental : rentals) {
            statement += rental.getMovie().getTitle() + " " + String.valueOf(rental.amount()) + "<br />";
        }
        return statement;
    }
}
