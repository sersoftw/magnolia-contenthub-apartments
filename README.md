# Magnolia ContentHub Apartments

Proyecto personal de aprendizaje sobre gestión de contenidos
de apartamentos turísticos, con ejemplos de configuración
para Magnolia y desarrollo de APIs en Java.

## Componentes y estado

- Módulo de ejemplo para Magnolia con YAML, plantillas FreeMarker,
  diálogos y recursos web. Pendiente de validar dentro del CMS.
- Preview independiente en HTML, CSS y JavaScript que carga
  datos de ejemplo desde un archivo JSON.
- Dos APIs independientes, orientadas a Java 11 y Java 21.
  Su conexión con contenido real de Magnolia está pendiente.
- Documentación de instalación y estudio de migración.
  No representa una migración ejecutada y validada.

La preview no utiliza Magnolia ni demuestra por sí sola
el funcionamiento del módulo dentro del CMS.

## Tecnologías y áreas de estudio

| Área | Tecnologías |
|---|---|
| CMS | Magnolia CMS, Light Modules, YAML, FreeMarker |
| Backend | Java 11, Java 21, HTTP API, JSON |
| Frontend | HTML5, CSS3, JavaScript |
| Arquitectura | Headless CMS, separación contenido/presentación, APIs |
| Documentación | Estructura del proyecto y guías técnicas |
| Estudio de migración | Magnolia 6.2 a 6.4 y Java 11 a Java 21; pendiente de validación |

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
└── README.md
```

---

## Ejecutar la preview

Requiere Python 3. Desde la raíz del repositorio:

```bash
cd preview
python -m http.server 8080
```

Abre http://localhost:8080.

En Windows, si el comando python no está disponible, utiliza:

```powershell
py -m http.server 8080
```

La preview carga `data/apartments.json` mediante fetch.
Utiliza el servidor local para evitar las restricciones del
navegador al abrir archivos directamente.

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



## Estado del proyecto

Proyecto preparado como base de portfolio. La parte Java está diseñada para compilar sin dependencias externas. La parte Magnolia es un light module de ejemplo/documentación que debe probarse dentro de una instalación local de Magnolia Community/DX según el entorno disponible.

---

## Autor

**Sergio Bernal Gálvez**  
Junior Developer / DAM  
Portfolio orientado a Java, Backend, Full Stack, Android y CMS empresarial.
