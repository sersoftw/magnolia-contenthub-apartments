package com.sersoftw.contenthub.java11.repository;

import com.sersoftw.contenthub.java11.model.Apartment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public final class InMemoryApartmentRepository implements ApartmentRepository {
    private final List<Apartment> apartments;

    public InMemoryApartmentRepository() {
        this.apartments = Collections.unmodifiableList(Arrays.asList(
                new Apartment("sevilla-centro-001", "Ático Alameda Premium", "Sevilla", 4, 145,
                        "Apartamento urbano con terraza, check-in autónomo y contenido preparado para campañas estacionales.",
                        Arrays.asList("WiFi", "Terraza", "Check-in autónomo", "Aire acondicionado")),
                new Apartment("malaga-playa-002", "Suite Malagueta Sea View", "Málaga", 3, 168,
                        "Alojamiento costero con vista al mar, ficha optimizada para SEO local y experiencias turísticas.",
                        Arrays.asList("Vista al mar", "WiFi", "Cocina", "Parking cercano")),
                new Apartment("cadiz-casco-003", "Loft Cádiz Histórico", "Cádiz", 2, 122,
                        "Loft en casco antiguo con gestión de servicios, disponibilidad editorial y enfoque mobile-first.",
                        Arrays.asList("Centro histórico", "WiFi", "Smart TV", "Guía local")),
                new Apartment("sevilla-triana-004", "Triana Riverside Home", "Sevilla", 5, 156,
                        "Apartamento familiar con contenido modular para destacar servicios, normas y recomendaciones.",
                        Arrays.asList("Familiar", "Río cercano", "Cocina", "Lavadora")),
                new Apartment("malaga-centro-005", "Málaga Soho Studio", "Málaga", 2, 115,
                        "Estudio moderno con estructura de datos preparada para integrarse con web externa o app móvil.",
                        Arrays.asList("Centro", "Coworking nearby", "WiFi", "Aire acondicionado")),
                new Apartment("cadiz-playa-006", "Caleta Sunset Apartment", "Cádiz", 4, 139,
                        "Apartamento cercano a la playa con contenido editable desde CMS y presentación visual atractiva.",
                        Arrays.asList("Playa", "Balcón", "WiFi", "Cuna disponible"))
        ));
    }

    @Override
    public List<Apartment> findAll() {
        return apartments;
    }

    @Override
    public List<Apartment> findByCity(String city) {
        if (city == null || city.trim().isEmpty()) {
            return findAll();
        }
        String normalizedCity = city.trim().toLowerCase(Locale.ROOT);
        List<Apartment> result = new ArrayList<Apartment>();
        for (Apartment apartment : apartments) {
            if (apartment.getCity().toLowerCase(Locale.ROOT).equals(normalizedCity)) {
                result.add(apartment);
            }
        }
        return result;
    }

    @Override
    public Optional<Apartment> findById(String id) {
        for (Apartment apartment : apartments) {
            if (apartment.getId().equals(id)) {
                return Optional.of(apartment);
            }
        }
        return Optional.empty();
    }
}
