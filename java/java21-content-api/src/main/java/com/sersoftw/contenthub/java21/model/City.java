package com.sersoftw.contenthub.java21.model;

import java.text.Normalizer;
import java.util.Locale;
import java.util.Optional;

public enum City {
    SEVILLA("Sevilla"),
    MALAGA("Málaga"),
    CADIZ("Cádiz");

    private final String displayName;

    City(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }

    public static Optional<City> from(String value) {
        if (value == null || value.isBlank()) {
            return Optional.empty();
        }
        String normalized = normalize(value);
        for (City city : values()) {
            if (normalize(city.displayName).equals(normalized) || city.name().toLowerCase(Locale.ROOT).equals(normalized)) {
                return Optional.of(city);
            }
        }
        return Optional.empty();
    }

    private static String normalize(String value) {
        String normalized = Normalizer.normalize(value, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
        return normalized.trim().toLowerCase(Locale.ROOT);
    }
}
