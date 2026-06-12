# Guía de instalación orientativa en Magnolia

Esta guía explica cómo probar el light module dentro de una instalación local de Magnolia. La estructura puede requerir pequeños ajustes según la edición, bundle y módulos instalados.

## 1. Requisitos

Para un entorno realista necesitarás:

- Java compatible con la versión de Magnolia que vayas a usar.
- Magnolia CMS instalado localmente.
- Tomcat compatible con la versión de Magnolia.
- Acceso al directorio de light modules.
- Editor de código: VS Code, IntelliJ o Eclipse.

## 2. Ubicación del light module

El módulo está en:

```text
magnolia/light-modules/tourist-apartments
```

En una instalación Magnolia, debes copiar esa carpeta dentro del directorio de light modules configurado por `magnolia.resources.dir`.

Ejemplo conceptual:

```text
<magnolia-resources-dir>/tourist-apartments
```

## 3. Verificar estructura

Comprueba que la carpeta tiene esta estructura:

```text
tourist-apartments/
├── module.yaml
├── templates/
├── dialogs/
├── contentTypes/
├── apps/
├── restEndpoints/
├── webresources/
└── i18n/
```

## 4. Reiniciar o refrescar Magnolia

Según la configuración de tu entorno, puede ser necesario:

- Reiniciar Tomcat/Magnolia.
- Refrescar los recursos desde la interfaz de administración.
- Revisar logs si alguna definición YAML tiene errores.

## 5. Crear una página usando la plantilla

Dentro de Magnolia:

1. Entra en la app de Pages.
2. Crea una página nueva.
3. Selecciona la plantilla `Home apartamentos turísticos`.
4. Añade componentes en el área principal:
   - Hero principal.
   - Buscador de apartamentos.
   - Apartamentos destacados.
   - Servicios.
   - CTA de contacto.
5. Edita los diálogos y publica o previsualiza.

## 6. Validación visual

Comprueba:

- Que la home carga sin errores.
- Que los componentes se pueden editar.
- Que CSS y JS se cargan correctamente.
- Que las áreas permiten añadir componentes.
- Que la web se adapta a móvil.

## 7. Nota importante

El light module está preparado como base de portfolio. En un entorno Magnolia real, algunas definiciones como `contentTypes`, `apps` o `restEndpoints` pueden necesitar ajustes según los módulos instalados y la edición exacta de Magnolia disponible.
