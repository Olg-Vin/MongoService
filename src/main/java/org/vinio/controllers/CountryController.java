package org.vinio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.vinio.models.Country;
import org.vinio.services.CountryService;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {
    @Autowired
    public CountryService countryService;

    @GetMapping("/get/{name}")
    public Country getCountry(@PathVariable String name) {
        return countryService.getCountryByName(name);
    }

    @PostMapping("/add")
    public void addCountry(@RequestBody Country country) {
        countryService.saveCountry(country);
    }

    @PostMapping("/update")
    public void updateCountry(@RequestBody Country country){
        countryService.saveCountry(country);
    }

    @GetMapping("/delete/{name}")
    public void deleteCountry(@PathVariable String name){
        countryService.deleteCountryByName(name);
    }
}
