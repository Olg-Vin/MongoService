package org.vinio.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Builder
@Document(collection = "countries")
// TODO index
public class Country {
    // TODO id
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private String continent;
    private double square;
    private String language;
    private String currency; // валюта

    private Set<City> cities;

}
