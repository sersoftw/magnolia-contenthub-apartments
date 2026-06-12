package com.sersoftw.contenthub.java21;

import com.sersoftw.contenthub.java21.http.ContentHubHttpServer;
import com.sersoftw.contenthub.java21.repository.InMemoryApartmentRepository;
import java.io.IOException;

public final class ContentHubJava21Application {

    private ContentHubJava21Application() {
    }

    public static void main(String[] args) throws IOException {
        int port = 8082;
        var server = new ContentHubHttpServer(port, new InMemoryApartmentRepository());
        server.start();
        System.out.println("Magnolia ContentHub Java 21 API running on http://localhost:" + port);
        System.out.println("Available endpoints: /health, /api/apartments, /api/apartments?city=Malaga, /api/apartments/{id}");
    }
}
