<section class="ta-hero">
  <div class="ta-hero__content">
    <p class="ta-eyebrow">${content.eyebrow!"CMS Headless · Java"}</p>
    <h1>${content.heading!"Gestiona apartamentos turísticos con Magnolia"}</h1>
    <p>${content.description!"Light module con componentes editables, plantillas FreeMarker y contenido preparado para integraciones."}</p>
    [#if content.buttonText?has_content]
      <a class="ta-button" href="${content.buttonUrl!"#"}">${content.buttonText}</a>
    [/#if]
  </div>
</section>
