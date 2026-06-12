<!DOCTYPE html>
<html lang="es">
<head>
  [#assign pageTitle = content.title!"Magnolia ContentHub Apartments" /]
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>${pageTitle}</title>
  ${resfn.css("/tourist-apartments.*css")!}
</head>
<body class="ta-page">
  <header class="ta-header">
    <a class="ta-logo" href="/">Magnolia ContentHub</a>
    <nav class="ta-nav" aria-label="Navegación principal">
      <a href="/apartamentos">Apartamentos</a>
      <a href="/servicios">Servicios</a>
      <a href="/contacto">Contacto</a>
    </nav>
  </header>

  <main>
    [@cms.area name="main" /]
  </main>

  <footer class="ta-footer">
    <p>Tourist Apartments · Contenido editable desde Magnolia CMS</p>
  </footer>
  ${resfn.js("/tourist-apartments.*js")!}
</body>
</html>
