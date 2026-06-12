# tourist-apartments light module

Light module de ejemplo para Magnolia CMS.

> Importante: un light module puede contener YAML, FreeMarker y recursos web. Para incorporar clases Java hay que usar un módulo Java/Maven separado. Por eso este repositorio separa `magnolia/light-modules` y `java/`.

## Contenido

- `module.yaml`: descriptor del módulo.
- `templates/pages`: plantillas de página.
- `templates/components`: componentes reutilizables.
- `dialogs`: diálogos editables por usuarios de negocio.
- `contentTypes`: definición conceptual del tipo `apartment`.
- `apps`: configuración conceptual de una content app.
- `webresources`: CSS y JS del módulo.
- `i18n`: mensajes en español.

## Instalación orientativa

Copia esta carpeta en el directorio de light modules de tu instalación de Magnolia y revisa `magnolia.resources.dir` según tu entorno local.
