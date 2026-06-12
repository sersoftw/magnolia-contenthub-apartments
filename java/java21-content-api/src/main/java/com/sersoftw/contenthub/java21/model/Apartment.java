package com.sersoftw.contenthub.java21.model;

import java.util.List;

public record Apartment(
        String id,
        String name,
        City city,
        int capacity,
        int pricePerNight,
        String description,
        List<String> services
) {
    public Apartment {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        if (pricePerNight <= 0) {
            throw new IllegalArgumentException("pricePerNight must be positive");
        }
        services = List.copyOf(services);
    }
}
