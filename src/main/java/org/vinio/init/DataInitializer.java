package org.vinio.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.vinio.models.City;
import org.vinio.models.Country;
import org.vinio.models.Sight;
import org.vinio.services.impl.CountryServiceImpl;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    public CountryServiceImpl countryService;
    private final Set<Sight> sights = new HashSet<>();
    private final Set<City> cities = new HashSet<>();
    @Override
    public void run(String... args) throws Exception {
        countryService.deleteCountryByName("Russian");
        countryService.deleteCountryByName("Сanada");
        countryService.deleteCountryByName("Japan");

        sights.add(Sight.builder().name("Kremlin").description("Some text...").imgUrl("").build());
        sights.add(Sight.builder().name("Grand Theatre").description("Some text...").imgUrl("").build());
        cities.add(City.builder().name("Moscow").population(13_000_000).sights(sights).build());
        Country country = Country.builder().name("Russian").language("ru").cities(cities).build();
        countryService.saveCountry(country);

        sights.clear(); cities.clear();

        sights.add(Sight.builder().name("Fort York").description("Some text...").imgUrl("").build());
        sights.add(Sight.builder().name("CN Tower").description("Some text...").imgUrl("").build());
        cities.add(City.builder().name("Toronto").population(2_700_000).sights(sights).build());
        country = Country.builder().name("Сanada").language("en").cities(cities).build();
        countryService.saveCountry(country);

        sights.clear(); cities.clear();

        sights.add(Sight.builder().name("Tokyo Sky Tree").description("Some text...").imgUrl("").build());
        sights.add(Sight.builder().name("Ueno Park").description("Some text...").imgUrl("").build());
        cities.add(City.builder().name("Tokyo").population(14_200_000).sights(sights).build());
        country = Country.builder().name("Japan").language("ja").cities(cities).build();
        countryService.saveCountry(country);
    }
}
