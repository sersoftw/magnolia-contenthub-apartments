# Java 21 Content API

API HTTP sencilla, sin dependencias externas, pensada para demostrar modernización a Java 21.

## Compilar

```bash
javac --release 21 -d target/classes $(find src/main/java -name "*.java")
```

## Ejecutar

```bash
java -cp target/classes com.sersoftw.contenthub.java21.ContentHubJava21Application
```

## Endpoints

```text
GET /health
GET /api/apartments
GET /api/apartments?city=Malaga
GET /api/apartments/{id}
```
