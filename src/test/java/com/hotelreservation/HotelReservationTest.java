package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

public class HotelReservationTest {
    @Test
    public void testAddHotelReservation(){
        HotelReservation hotelReservation = new HotelReservation();
        HashMap<String,Integer> add=hotelReservation.addHotelResrevation();
        Assertions.assertTrue(add.containsKey("Lakewood"));
    }
}
