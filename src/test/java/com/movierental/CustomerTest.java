package com.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void test(){

        Customer customer = new Customer("Pallav");
        customer.addRental(new Rental(new Movie("Avengers", 0), 2));
        customer.addRental(new Rental(new Movie("John Wick", 1), 2));

        String result = customer.statement();

        Assert.assertEquals("Rental Record for Pallav\n" +
                "\tAvengers\t2.0\n" +
                "\tJohn Wick\t6.0\n" +
                "Amount owed is 8.0\n" +
                "You earned 3 frequent renter points", result);
    }

}