<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>${content.title!"Detalle de apartamento"}</title>
  ${resfn.css("/tourist-apartments.*css")!}
</head>
<body class="ta-page">
  <header class="ta-header">
    <a class="ta-logo" href="/">Magnolia ContentHub</a>
  </header>
  <main>
    [@cms.area name="main" /]
  </main>
  ${resfn.js("/tourist-apartments.*js")!}
</body>
</html>
