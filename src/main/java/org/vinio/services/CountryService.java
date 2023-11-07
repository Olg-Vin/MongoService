package org.vinio.services;

import org.vinio.models.City;
import org.vinio.models.Country;

public interface CountryService {
    Country saveCountry(Country country);
    Country getCountryByName(String name);
    Country updateCountryByName(Country country);
    void deleteCountryByName(String name);

//    void saveCity(City city);
//    City getCityByName(String name);
//    City updateCityByName(String name);
//    City deleteCityByName(String name);
}
