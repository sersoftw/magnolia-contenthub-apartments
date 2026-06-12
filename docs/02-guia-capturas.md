# Guía de capturas para GitHub y portfolio

Estas capturas ayudan a presentar el proyecto de forma profesional.

## Captura 1: portada del repositorio

Imagen recomendada:

- README abierto en GitHub.
- Se debe ver el título `Magnolia ContentHub Apartments`.
- Se debe ver la descripción del proyecto y tecnologías.

Uso:

- Portfolio.
- LinkedIn.
- Candidatura InfoJobs si permite adjuntar enlace.

## Captura 2: preview visual

Abre:

```text
preview/index.html
```

O ejecuta:

```bash
cd preview
python -m http.server 8080
```

Captura la parte superior de la web con:

- Hero principal.
- Texto “CMS empresarial · Java · Headless”.
- Tarjeta de stack principal.

## Captura 3: listado de apartamentos

Haz scroll hasta `Apartamentos destacados`.

Captura:

- Filtro por ciudad.
- Tarjetas de apartamentos.
- Diseño responsive si quieres mostrar una captura móvil.

## Captura 4: estructura Magnolia

En GitHub o VS Code captura:

```text
magnolia/light-modules/tourist-apartments/templates
magnolia/light-modules/tourist-apartments/dialogs
```

Esta captura demuestra que no es solo una web estática, sino una estructura orientada a Magnolia.

## Captura 5: API Java funcionando

Ejecuta una de las APIs y captura navegador o terminal.

Java 11:

```bash
cd java/java11-content-api
javac --release 11 -d target/classes $(find src/main/java -name "*.java")
java -cp target/classes com.sersoftw.contenthub.java11.ContentHubJava11Application
```

Luego abre:

```text
http://localhost:8081/api/apartments
```

Java 21:

```bash
cd java/java21-content-api
javac --release 21 -d target/classes $(find src/main/java -name "*.java")
java -cp target/classes com.sersoftw.contenthub.java21.ContentHubJava21Application
```

Luego abre:

```text
http://localhost:8082/api/apartments
```

## Captura 6: guía de migración

Abre:

```text
docs/03-migracion-62-java11-a-64-java21.md
```

Captura el checklist o la tabla de riesgos.

Esta captura es especialmente útil para la oferta porque menciona explícitamente Magnolia 6.2 + Java 11 y Magnolia 6.4 + Java 21.
