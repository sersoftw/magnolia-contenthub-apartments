# Magnolia ContentHub Apartments

**Proyecto de portfolio orientado a ofertas que solicitan Magnolia 6.2 + Java 11 y Magnolia 6.4 + Java 21.**

Este repositorio simula un proyecto profesional de CMS empresarial para una empresa de apartamentos turísticos. El objetivo es demostrar conocimientos de Magnolia CMS, arquitectura headless, Java, migración tecnológica y documentación técnica de calidad.

---

## Resumen del proyecto

**Magnolia ContentHub Apartments** permite gestionar contenido de apartamentos turísticos desde Magnolia y consumirlo desde una capa externa tipo headless/API.

Incluye:

- Un **light module de Magnolia** con estructura YAML, FreeMarker, diálogos, componentes, plantillas y recursos web.
- Una **preview estática** para poder mostrar el resultado visual en GitHub Pages sin instalar Magnolia.
- Una **API Java 11** compatible con entornos legacy similares a Magnolia 6.2.
- Una **API Java 21** modernizada para demostrar actualización tecnológica hacia entornos Magnolia 6.4.
- Documentación profesional de instalación, capturas, arquitectura y migración.
- Texto listo para añadir al portfolio y a candidaturas de empleo.

---

## Tecnologías demostradas

| Área | Tecnologías |
|---|---|
| CMS | Magnolia CMS, Light Modules, YAML, FreeMarker |
| Backend | Java 11, Java 21, HTTP API, JSON |
| Frontend | HTML5, CSS3, JavaScript |
| Arquitectura | Headless CMS, separación contenido/presentación, APIs |
| DevOps/Calidad | GitHub Actions, estructura de repositorio, documentación técnica |
| Migración | Magnolia 6.2 -> 6.4, Java 11 -> Java 21, Tomcat/Jakarta EE |

---

## Estructura del repositorio

```text
magnolia-contenthub-apartments/
├── magnolia/
│   └── light-modules/
│       └── tourist-apartments/       # Light module para Magnolia
├── java/
│   ├── java11-content-api/           # API compatible Java 11
│   └── java21-content-api/           # API modernizada Java 21
├── preview/                          # Demo visual para GitHub Pages
├── docs/                             # Documentación profesional
├── scripts/                          # Scripts de ayuda
├── .github/workflows/validate.yml    # Workflow de validación
└── README.md
```

---

## Vista rápida: preview sin instalar Magnolia

La carpeta `preview/` contiene una versión visual para enseñar el proyecto en el portfolio.

### Opción 1: abrir directamente

Abre este archivo en el navegador:

```text
preview/index.html
```

### Opción 2: servidor local

Desde la raíz del proyecto:

```bash
cd preview
python -m http.server 8080
```

Después abre:

```text
http://localhost:8080
```

---

## Ejecutar la API Java 11

La API Java 11 no necesita dependencias externas.

```bash
cd java/java11-content-api
javac --release 11 -d target/classes $(find src/main/java -name "*.java")
java -cp target/classes com.sersoftw.contenthub.java11.ContentHubJava11Application
```

Endpoints:

```text
GET http://localhost:8081/health
GET http://localhost:8081/api/apartments
GET http://localhost:8081/api/apartments?city=Sevilla
```

---

## Ejecutar la API Java 21

La API Java 21 usa características modernas como `record`, `List.copyOf`, switch expressions y una estructura más limpia.

```bash
cd java/java21-content-api
javac --release 21 -d target/classes $(find src/main/java -name "*.java")
java -cp target/classes com.sersoftw.contenthub.java21.ContentHubJava21Application
```

Endpoints:

```text
GET http://localhost:8082/health
GET http://localhost:8082/api/apartments
GET http://localhost:8082/api/apartments?city=Malaga
```

---

## Integración con Magnolia

El light module está en:

```text
magnolia/light-modules/tourist-apartments
```

Está preparado para representar:

- Página home.
- Listado de apartamentos.
- Detalle de apartamento.
- Componentes reutilizables: hero, buscador, tarjetas, servicios y llamada a la acción.
- Diálogos editables por el usuario de negocio.
- Recursos CSS y JavaScript.
- Definición de tipo de contenido `apartment`.

Consulta la guía completa en:

```text
docs/01-instalacion-magnolia.md
```

---

## Qué demuestra este proyecto ante una empresa

Este proyecto está diseñado para explicar en entrevista que sabes:

- Analizar una oferta técnica y construir una prueba orientada al puesto.
- Trabajar con un CMS empresarial basado en módulos y configuración YAML.
- Separar contenido, presentación y lógica backend.
- Documentar una migración realista de Java 11 a Java 21.
- Comprender el impacto de migrar de Magnolia 6.2 a Magnolia 6.4.
- Crear repositorios profesionales y presentables para selección técnica.

---

## Texto corto para el portfolio

> Magnolia ContentHub Apartments es un proyecto de CMS/headless orientado a empresas turísticas. Incluye un light module de Magnolia con plantillas FreeMarker, componentes editables, diálogos YAML y recursos frontend, además de dos APIs Java independientes: una compatible con Java 11 y otra modernizada con Java 21. El proyecto incorpora documentación de arquitectura y una guía de migración desde Magnolia 6.2 + Java 11 hacia Magnolia 6.4 + Java 21.

Más textos listos en:

```text
docs/04-texto-portfolio.md
```

---

## Estado del proyecto

Proyecto preparado como base de portfolio. La parte Java está diseñada para compilar sin dependencias externas. La parte Magnolia es un light module de ejemplo/documentación que debe probarse dentro de una instalación local de Magnolia Community/DX según el entorno disponible.

---

## Autor

**Sergio Bernal Gálvez**  
Junior Developer / DAM  
Portfolio orientado a Java, Backend, Full Stack, Android y CMS empresarial.
