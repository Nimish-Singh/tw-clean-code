package com.thoughtworks.movierental;

class TextStatement {
    private final String name;
    private final Rentals rentals;

    TextStatement(String name, Rentals rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    String textStatement() {
        return textHeader() + textBody() + textFooter();
    }

    private String textFooter() {
        return Customer.AMOUNT_OWED_IS + String.valueOf(rentals.totalAmount()) + "\n"
                + Customer.YOU_EARNED + String.valueOf(rentals.totalFrequentRenterPoints())
                + Customer.FREQUENT_RENTER_POINTS;
    }

    private String textHeader() {
        return Customer.RENTAL_RECORD_FOR + name + "\n";
    }

    private String textBody() {
        String statement = "";
        for (Rental rental : rentals) {
            statement += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.amount()) + "\n";
        }
        return statement;
    }
}
