package org.vinio.models;


import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class City {
//    private String id;
    private String name;
    private int population;
    private Set<Sight> sights;

    public void setSights(Sight sight) {
        this.sights.add(sight);
    }
}
