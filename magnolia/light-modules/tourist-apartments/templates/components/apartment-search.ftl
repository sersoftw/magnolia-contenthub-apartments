<section class="ta-section ta-search">
  <p class="ta-eyebrow">${content.eyebrow!"Búsqueda"}</p>
  <h2>${content.heading!"Encuentra el alojamiento ideal"}</h2>
  <form class="ta-search__form" action="${content.actionUrl!"/apartamentos"}" method="get">
    <label>
      Ciudad
      <select name="city">
        <option value="">Todas</option>
        <option value="Sevilla">Sevilla</option>
        <option value="Málaga">Málaga</option>
        <option value="Cádiz">Cádiz</option>
      </select>
    </label>
    <label>
      Huéspedes
      <input type="number" name="guests" min="1" max="8" value="2">
    </label>
    <button class="ta-button" type="submit">Buscar</button>
  </form>
</section>
