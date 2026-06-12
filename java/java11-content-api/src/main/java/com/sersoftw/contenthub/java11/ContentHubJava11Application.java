package com.sersoftw.contenthub.java11;

import com.sersoftw.contenthub.java11.http.ContentHubHttpServer;
import com.sersoftw.contenthub.java11.repository.InMemoryApartmentRepository;
import java.io.IOException;

public final class ContentHubJava11Application {

    private ContentHubJava11Application() {
        // Utility class
    }

    public static void main(String[] args) throws IOException {
        int port = 8081;
        ContentHubHttpServer server = new ContentHubHttpServer(port, new InMemoryApartmentRepository());
        server.start();
        System.out.println("Magnolia ContentHub Java 11 API running on http://localhost:" + port);
        System.out.println("Available endpoints: /health, /api/apartments, /api/apartments?city=Sevilla, /api/apartments/{id}");
    }
}
