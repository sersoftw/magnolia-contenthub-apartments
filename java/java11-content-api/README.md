# Java 11 Content API

API HTTP sencilla, sin dependencias externas, pensada para demostrar compatibilidad con entornos Java 11.

## Compilar

```bash
javac --release 11 -d target/classes $(find src/main/java -name "*.java")
```

## Ejecutar

```bash
java -cp target/classes com.sersoftw.contenthub.java11.ContentHubJava11Application
```

## Endpoints

```text
GET /health
GET /api/apartments
GET /api/apartments?city=Sevilla
GET /api/apartments/{id}
```
