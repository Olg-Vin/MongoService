package org.vinio.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vinio.models.Country;
import org.vinio.repositories.CountryRepository;
import org.vinio.services.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;
    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country getCountryByName(String name) {
        return countryRepository.getByName(name);
    }

    @Override
    public Country updateCountryByName(Country country) {
        return saveCountry(country);
    }

    @Override
    public void deleteCountryByName(String name) {
        countryRepository.deleteByName(name);
    }
}
