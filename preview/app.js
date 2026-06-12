const apartmentGrid = document.querySelector('#apartmentGrid');
const cityFilter = document.querySelector('#cityFilter');
const menuButton = document.querySelector('.menu-button');
const navLinks = document.querySelector('.nav-links');

async function loadApartments() {
  const response = await fetch('./data/apartments.json');
  if (!response.ok) {
    throw new Error('No se pudieron cargar los apartamentos');
  }
  return response.json();
}

function renderApartments(apartments) {
  apartmentGrid.innerHTML = apartments.map((apartment) => `
    <article class="apartment-card">
      <div class="apartment-image" data-city="${apartment.city}"></div>
      <div class="apartment-body">
        <h3>${apartment.name}</h3>
        <p>${apartment.description}</p>
        <div class="apartment-meta">
          <span>${apartment.capacity} huéspedes</span>
          <span>${apartment.pricePerNight} €/noche</span>
        </div>
      </div>
    </article>
  `).join('');
}

function filterApartments(apartments, city) {
  if (city === 'all') {
    return apartments;
  }
  return apartments.filter((apartment) => apartment.city === city);
}

async function init() {
  try {
    const apartments = await loadApartments();
    renderApartments(apartments);

    cityFilter.addEventListener('change', (event) => {
      renderApartments(filterApartments(apartments, event.target.value));
    });
  } catch (error) {
    apartmentGrid.innerHTML = `<p>No se pudo cargar el contenido: ${error.message}</p>`;
  }
}

menuButton.addEventListener('click', () => {
  const isOpen = navLinks.classList.toggle('open');
  menuButton.setAttribute('aria-expanded', String(isOpen));
});

init();
