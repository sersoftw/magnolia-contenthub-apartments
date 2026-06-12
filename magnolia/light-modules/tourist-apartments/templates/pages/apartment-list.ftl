<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>${content.title!"Apartamentos"}</title>
  ${resfn.css("/tourist-apartments.*css")!}
</head>
<body class="ta-page">
  <header class="ta-header">
    <a class="ta-logo" href="/">Magnolia ContentHub</a>
  </header>
  <main class="ta-section">
    <p class="ta-eyebrow">Contenido Magnolia</p>
    <h1>${content.heading!"Listado de apartamentos"}</h1>
    <p>${content.intro!"Listado preparado para conectarse a una fuente de contenido o delivery API."}</p>
    [@cms.area name="main" /]
  </main>
  ${resfn.js("/tourist-apartments.*js")!}
</body>
</html>
