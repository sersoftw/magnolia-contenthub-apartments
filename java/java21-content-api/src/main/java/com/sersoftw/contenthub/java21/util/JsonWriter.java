package com.sersoftw.contenthub.java21.util;

import com.sersoftw.contenthub.java21.model.Apartment;
import java.util.List;

public final class JsonWriter {

    private JsonWriter() {
    }

    public static String apartmentsToJson(List<Apartment> apartments) {
        return apartments.stream()
                .map(JsonWriter::apartmentToJson)
                .reduce((left, right) -> left + "," + right)
                .map(content -> "[" + content + "]")
                .orElse("[]");
    }

    public static String apartmentToJson(Apartment apartment) {
        return "{" +
                field("id", apartment.id()) + "," +
                field("name", apartment.name()) + "," +
                field("city", apartment.city().displayName()) + "," +
                numberField("capacity", apartment.capacity()) + "," +
                numberField("pricePerNight", apartment.pricePerNight()) + "," +
                field("description", apartment.description()) + "," +
                arrayField("services", apartment.services()) +
                "}";
    }

    private static String field(String name, String value) {
        return quote(name) + ":" + quote(value);
    }

    private static String numberField(String name, int value) {
        return quote(name) + ":" + value;
    }

    private static String arrayField(String name, List<String> values) {
        return quote(name) + ":[" + String.join(",", values.stream().map(JsonWriter::quote).toList()) + "]";
    }

    private static String quote(String value) {
        return "\"" + value
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t") + "\"";
    }
}
