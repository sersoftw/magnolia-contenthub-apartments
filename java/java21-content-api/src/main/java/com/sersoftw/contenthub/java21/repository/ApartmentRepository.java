package com.sersoftw.contenthub.java21.repository;

import com.sersoftw.contenthub.java21.model.Apartment;
import com.sersoftw.contenthub.java21.model.City;
import java.util.List;
import java.util.Optional;

public interface ApartmentRepository {
    List<Apartment> findAll();

    List<Apartment> findByCity(City city);

    Optional<Apartment> findById(String id);
}
