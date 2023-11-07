package org.vinio.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.vinio.models.City;
import org.vinio.models.Country;

@Repository
public interface CountryRepository extends MongoRepository<Country, String> {
    Country getByName(String name);

    void deleteByName(String name);

//    TODO more custom!

}
