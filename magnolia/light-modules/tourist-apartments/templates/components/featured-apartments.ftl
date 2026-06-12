<section class="ta-section">
  <p class="ta-eyebrow">${content.eyebrow!"Destacados"}</p>
  <h2>${content.heading!"Apartamentos recomendados"}</h2>
  <p>${content.description!"Componente preparado para mostrar contenido destacado desde Magnolia o desde una API de entrega."}</p>

  <div class="ta-card-grid">
    [#-- En Magnolia real, este listado puede alimentarse desde un content app, delivery endpoint o integración Java. --]
    <article class="ta-card">
      <span>Sevilla</span>
      <h3>Ático Alameda Premium</h3>
      <p>Terraza, check-in autónomo y ficha optimizada para campañas.</p>
    </article>
    <article class="ta-card">
      <span>Málaga</span>
      <h3>Suite Malagueta Sea View</h3>
      <p>Vista al mar, contenido SEO local y experiencias turísticas.</p>
    </article>
    <article class="ta-card">
      <span>Cádiz</span>
      <h3>Loft Cádiz Histórico</h3>
      <p>Contenido editable para alojamientos urbanos y mobile-first.</p>
    </article>
  </div>
</section>
