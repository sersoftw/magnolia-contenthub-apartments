package com.sersoftw.contenthub.java11.repository;

import com.sersoftw.contenthub.java11.model.Apartment;
import java.util.List;
import java.util.Optional;

public interface ApartmentRepository {
    List<Apartment> findAll();

    List<Apartment> findByCity(String city);

    Optional<Apartment> findById(String id);
}
