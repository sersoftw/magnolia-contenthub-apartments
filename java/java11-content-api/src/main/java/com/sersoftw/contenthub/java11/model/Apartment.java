package com.sersoftw.contenthub.java11.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Apartment {
    private final String id;
    private final String name;
    private final String city;
    private final int capacity;
    private final int pricePerNight;
    private final String description;
    private final List<String> services;

    public Apartment(String id, String name, String city, int capacity, int pricePerNight, String description, List<String> services) {
        this.id = Objects.requireNonNull(id, "id");
        this.name = Objects.requireNonNull(name, "name");
        this.city = Objects.requireNonNull(city, "city");
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.description = Objects.requireNonNull(description, "description");
        this.services = Collections.unmodifiableList(new ArrayList<String>(Objects.requireNonNull(services, "services")));
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getServices() {
        return services;
    }
}
