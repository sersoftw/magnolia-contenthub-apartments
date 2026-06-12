# Guion para defender el proyecto en entrevista

## 1. Presentación breve

Este proyecto lo he creado específicamente para una oferta que pedía Magnolia 6.2 con Java 11 y Magnolia 6.4 con Java 21. Mi objetivo era demostrar que, aunque soy junior, puedo analizar requisitos reales y construir una prueba técnica orientada al puesto.

## 2. Problema planteado

Una empresa turística necesita gestionar contenido de apartamentos desde un CMS empresarial y reutilizar ese contenido en diferentes canales, como web, mobile o integraciones externas.

## 3. Solución

He separado el proyecto en tres partes:

- Un light module de Magnolia para la parte editorial.
- Una API Java 11 para representar un entorno compatible con sistemas existentes.
- Una API Java 21 para representar una versión modernizada.

## 4. Decisiones técnicas

Elegí un light module porque permite trabajar con YAML, FreeMarker, templates, dialogs y recursos web sin necesitar inicialmente un módulo Java compilado.

Separé la parte Java porque los light modules no incorporan clases Java. Esto hace que la arquitectura sea más limpia y permite explicar mejor la diferencia entre configuración CMS y backend.

## 5. Qué aprendí

- Estructura básica de proyectos Magnolia.
- Uso de light modules.
- Organización de templates y dialogs.
- Diferencias entre Java 11 y Java 21.
- Riesgos de migración de un CMS empresarial.
- Importancia de documentar instalación, pruebas y rollback.

## 6. Cómo seguiría mejorándolo

- Probar el light module en una instalación real de Magnolia.
- Conectar la API Java con contenido real del CMS.
- Añadir autenticación para endpoints privados.
- Crear tests automatizados.
- Añadir despliegue Docker para entorno local.
- Añadir screenshots reales de Magnolia una vez instalado.
