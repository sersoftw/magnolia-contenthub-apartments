package com.sersoftw.contenthub.java11.util;

import com.sersoftw.contenthub.java11.model.Apartment;
import java.util.List;

public final class JsonWriter {

    private JsonWriter() {
        // Utility class
    }

    public static String apartmentsToJson(List<Apartment> apartments) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < apartments.size(); i++) {
            if (i > 0) {
                builder.append(",");
            }
            builder.append(apartmentToJson(apartments.get(i)));
        }
        builder.append("]");
        return builder.toString();
    }

    public static String apartmentToJson(Apartment apartment) {
        return new StringBuilder()
                .append("{")
                .append(field("id", apartment.getId())).append(",")
                .append(field("name", apartment.getName())).append(",")
                .append(field("city", apartment.getCity())).append(",")
                .append(numberField("capacity", apartment.getCapacity())).append(",")
                .append(numberField("pricePerNight", apartment.getPricePerNight())).append(",")
                .append(field("description", apartment.getDescription())).append(",")
                .append(arrayField("services", apartment.getServices()))
                .append("}")
                .toString();
    }

    private static String field(String name, String value) {
        return quote(name) + ":" + quote(value);
    }

    private static String numberField(String name, int value) {
        return quote(name) + ":" + value;
    }

    private static String arrayField(String name, List<String> values) {
        StringBuilder builder = new StringBuilder();
        builder.append(quote(name)).append(":").append("[");
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) {
                builder.append(",");
            }
            builder.append(quote(values.get(i)));
        }
        builder.append("]");
        return builder.toString();
    }

    private static String quote(String value) {
        return "\"" + escape(value) + "\"";
    }

    private static String escape(String value) {
        return value
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
