package com.sersoftw.contenthub.java21.http;

import com.sersoftw.contenthub.java21.model.City;
import com.sersoftw.contenthub.java21.repository.ApartmentRepository;
import com.sersoftw.contenthub.java21.util.JsonWriter;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public final class ContentHubHttpServer {
    private final HttpServer server;
    private final ApartmentRepository apartmentRepository;

    public ContentHubHttpServer(int port, ApartmentRepository apartmentRepository) throws IOException {
        this.apartmentRepository = apartmentRepository;
        this.server = HttpServer.create(new InetSocketAddress(port), 0);
        this.server.createContext("/health", this::handleHealth);
        this.server.createContext("/api/apartments", this::handleApartments);
        this.server.setExecutor(null);
    }

    public void start() {
        server.start();
    }

    private void handleHealth(HttpExchange exchange) throws IOException {
        if (!isGet(exchange)) {
            send(exchange, 405, "{\"error\":\"Method not allowed\"}");
            return;
        }
        send(exchange, 200, "{\"status\":\"UP\",\"runtime\":\"Java 21 modernized\"}");
    }

    private void handleApartments(HttpExchange exchange) throws IOException {
        if (!isGet(exchange)) {
            send(exchange, 405, "{\"error\":\"Method not allowed\"}");
            return;
        }

        URI uri = exchange.getRequestURI();
        String path = uri.getPath();
        String basePath = "/api/apartments";

        if (path.length() > basePath.length() + 1) {
            String id = path.substring(basePath.length() + 1);
            var apartment = apartmentRepository.findById(id);
            send(exchange, apartment.isPresent() ? 200 : 404,
                    apartment.map(JsonWriter::apartmentToJson).orElse("{\"error\":\"Apartment not found\"}"));
            return;
        }

        Map<String, String> params = queryParams(uri.getRawQuery());
        var city = City.from(params.get("city"));
        var apartments = city.map(apartmentRepository::findByCity).orElseGet(apartmentRepository::findAll);
        send(exchange, 200, JsonWriter.apartmentsToJson(apartments));
    }

    private boolean isGet(HttpExchange exchange) {
        return switch (exchange.getRequestMethod()) {
            case "GET", "get" -> true;
            default -> "GET".equalsIgnoreCase(exchange.getRequestMethod());
        };
    }

    private Map<String, String> queryParams(String rawQuery) {
        Map<String, String> params = new HashMap<>();
        if (rawQuery == null || rawQuery.isBlank()) {
            return params;
        }
        for (String pair : rawQuery.split("&")) {
            int separator = pair.indexOf('=');
            if (separator > -1) {
                String key = decode(pair.substring(0, separator));
                String value = decode(pair.substring(separator + 1));
                params.put(key, value);
            }
        }
        return params;
    }

    private String decode(String value) {
        return URLDecoder.decode(value, StandardCharsets.UTF_8);
    }

    private void send(HttpExchange exchange, int status, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().add("Content-Type", "application/json; charset=utf-8");
        exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream outputStream = exchange.getResponseBody()) {
            outputStream.write(bytes);
        }
    }
}
