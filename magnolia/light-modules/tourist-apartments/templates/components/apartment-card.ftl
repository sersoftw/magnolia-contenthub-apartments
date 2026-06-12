<article class="ta-card">
  <span>${content.city!"Ciudad"}</span>
  <h3>${content.name!"Nombre del apartamento"}</h3>
  <p>${content.description!"Descripción breve del alojamiento."}</p>
  [#if content.pricePerNight?has_content]
    <strong>${content.pricePerNight} €/noche</strong>
  [/#if]
</article>
