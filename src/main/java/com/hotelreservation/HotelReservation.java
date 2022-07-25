package com.hotelreservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HotelReservation {
    public Object hotelDetailsNormalDay;

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation");
    }

    public HashMap<String, Integer> addHotelResrevation(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Lakewood",110);
        map.put("Bridgewood",160);
        map.put("Ridgewood",160);
        System.out.println(map);
        return map;
    }
}
