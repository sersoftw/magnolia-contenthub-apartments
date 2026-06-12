package com.sersoftw.contenthub.java21.repository;

import com.sersoftw.contenthub.java21.model.Apartment;
import com.sersoftw.contenthub.java21.model.City;
import java.util.List;
import java.util.Optional;

public final class InMemoryApartmentRepository implements ApartmentRepository {
    private final List<Apartment> apartments = List.of(
            new Apartment("sevilla-centro-001", "Ático Alameda Premium", City.SEVILLA, 4, 145,
                    "Apartamento urbano con terraza, check-in autónomo y contenido preparado para campañas estacionales.",
                    List.of("WiFi", "Terraza", "Check-in autónomo", "Aire acondicionado")),
            new Apartment("malaga-playa-002", "Suite Malagueta Sea View", City.MALAGA, 3, 168,
                    "Alojamiento costero con vista al mar, ficha optimizada para SEO local y experiencias turísticas.",
                    List.of("Vista al mar", "WiFi", "Cocina", "Parking cercano")),
            new Apartment("cadiz-casco-003", "Loft Cádiz Histórico", City.CADIZ, 2, 122,
                    "Loft en casco antiguo con gestión de servicios, disponibilidad editorial y enfoque mobile-first.",
                    List.of("Centro histórico", "WiFi", "Smart TV", "Guía local")),
            new Apartment("sevilla-triana-004", "Triana Riverside Home", City.SEVILLA, 5, 156,
                    "Apartamento familiar con contenido modular para destacar servicios, normas y recomendaciones.",
                    List.of("Familiar", "Río cercano", "Cocina", "Lavadora")),
            new Apartment("malaga-centro-005", "Málaga Soho Studio", City.MALAGA, 2, 115,
                    "Estudio moderno con estructura de datos preparada para integrarse con web externa o app móvil.",
                    List.of("Centro", "Coworking nearby", "WiFi", "Aire acondicionado")),
            new Apartment("cadiz-playa-006", "Caleta Sunset Apartment", City.CADIZ, 4, 139,
                    "Apartamento cercano a la playa con contenido editable desde CMS y presentación visual atractiva.",
                    List.of("Playa", "Balcón", "WiFi", "Cuna disponible"))
    );

    @Override
    public List<Apartment> findAll() {
        return apartments;
    }

    @Override
    public List<Apartment> findByCity(City city) {
        return apartments.stream()
                .filter(apartment -> apartment.city() == city)
                .toList();
    }

    @Override
    public Optional<Apartment> findById(String id) {
        return apartments.stream()
                .filter(apartment -> apartment.id().equals(id))
                .findFirst();
    }
}
