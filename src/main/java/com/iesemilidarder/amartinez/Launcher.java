package com.iesemilidarder.amartinez;

import com.iesemilidarder.amartinez.data.Hotel;

public class Launcher {
    public static void main(String... args) {

        System.out.println("TripAdrisor APP 1.0");
        Hotel hotel = new Hotel();
        hotel.setName("¡Viva Palma!");
        System.out.println("Nombre del Hotel: " + hotel.getName());
        hotel.setZone("Playas de Palma");
        System.out.println("Ubicación: " + hotel.getZone());
        hotel.setPrice(60.40);
        System.out.println("Precio por noche: " + hotel.getPrice());
        hotel.star();
        hotel.date();

    }
}
