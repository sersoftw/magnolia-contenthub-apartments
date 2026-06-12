# Guía de migración: Magnolia 6.2 + Java 11 a Magnolia 6.4 + Java 21

## Objetivo

Definir un plan técnico para evolucionar un proyecto Magnolia desde un entorno basado en **Magnolia 6.2 + Java 11** hacia un entorno moderno basado en **Magnolia 6.4 + Java 21**.

## Contexto

En proyectos empresariales, una migración de CMS no consiste solo en actualizar una versión. También hay que revisar:

- Compatibilidad del runtime Java.
- Servidor de aplicaciones.
- Cambios en APIs, dependencias y módulos.
- Plantillas FreeMarker.
- Definiciones YAML.
- Integraciones REST/headless.
- Workflows editoriales.
- Backups y rollback.

## Arquitectura antes de migrar

```text
Magnolia 6.2
├── Java 11
├── Tomcat compatible con la rama 6.2
├── Light modules
├── Templates FreeMarker
├── Dialogs YAML
├── Custom modules Java legacy
└── Integraciones REST existentes
```

## Arquitectura objetivo

```text
Magnolia 6.4
├── Java 21 runtime
├── Tomcat 10.1+ / entorno Jakarta EE 10
├── Light modules revisados
├── Templates FreeMarker compatibles
├── Dialogs YAML validados
├── Custom modules revisados y recompilados
└── Delivery/API revisada
```

## Checklist técnico

| Fase | Acción | Resultado esperado |
|---|---|---|
| 1 | Inventariar módulos instalados | Lista completa de módulos, versiones y dependencias |
| 2 | Revisar light modules | YAML, dialogs, templates y resources validados |
| 3 | Revisar módulos Java | Código compatible con Java moderno y dependencias actualizadas |
| 4 | Revisar servidor | Tomcat/entorno compatible con Magnolia 6.4 |
| 5 | Revisar APIs | Endpoints REST/headless funcionando |
| 6 | Migrar entorno de pruebas | Magnolia arranca sin errores críticos |
| 7 | Pruebas editoriales | Crear, editar, previsualizar y publicar contenido |
| 8 | Pruebas frontend | Páginas, CSS, JS y responsive correctos |
| 9 | Pruebas backend | APIs y servicios Java correctos |
| 10 | Plan de rollback | Backups probados y restauración documentada |

## Riesgos principales

| Riesgo | Impacto | Mitigación |
|---|---|---|
| Incompatibilidad de dependencias Java | Alto | Revisar `pom.xml`, actualizar librerías y compilar en entorno controlado |
| Cambios de Jakarta EE | Alto | Revisar paquetes `javax.*` frente a `jakarta.*` en módulos personalizados |
| Plantillas con funciones obsoletas | Medio | Revisar logs y validar páginas críticas |
| YAML no compatible | Medio | Validar definiciones una por una en entorno de desarrollo |
| Fallos en integraciones REST | Alto | Pruebas con Postman/cURL antes de producción |
| Pérdida de contenido | Muy alto | Backup completo y prueba de restauración |

## Estrategia recomendada

### 1. Preparar rama de migración

Crear una rama específica:

```bash
git checkout -b migration/magnolia-6-4-java-21
```

### 2. Validar Java

Comprobar versión:

```bash
java -version
```

Compilar código legacy:

```bash
javac --release 11 ...
```

Compilar código modernizado:

```bash
javac --release 21 ...
```

### 3. Revisar imports y dependencias

En módulos Java personalizados buscar:

```text
javax.
```

Y revisar si hay que adaptar a:

```text
jakarta.
```

### 4. Validar light modules

Revisar:

- `templates/pages/*.yaml`
- `templates/components/*.yaml`
- `dialogs/**/*.yaml`
- `webresources/css/*.css`
- `webresources/js/*.js`

### 5. Probar casos críticos

- Login en Magnolia.
- Crear página.
- Añadir componentes.
- Editar diálogos.
- Previsualizar.
- Publicar.
- Consumir endpoints.
- Revisar logs.

## Pruebas mínimas

| Prueba | Criterio de éxito |
|---|---|
| Arranque de Magnolia | El CMS inicia sin errores bloqueantes |
| Página home | Renderiza hero, componentes y estilos |
| Edición CMS | Los diálogos guardan contenido |
| API apartamentos | Devuelve JSON válido |
| Filtro por ciudad | Devuelve resultados coherentes |
| Responsive | La interfaz se adapta a móvil |
| Rollback | Se puede restaurar backup probado |

## Cómo explicarlo en entrevista

> Para la oferta preparé un proyecto que separa un light module de Magnolia de una capa Java. La idea es simular un caso real donde el CMS gestiona contenido editorial y Java expone o transforma datos para canales externos. Además, documenté la migración de Magnolia 6.2 con Java 11 hacia Magnolia 6.4 con Java 21, prestando atención a servidor, dependencias, Jakarta EE, plantillas y pruebas de rollback.
