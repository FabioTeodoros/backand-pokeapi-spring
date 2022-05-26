package com.fabiopokeapi.webclientpokeapi.entities;

import com.fabiopokeapi.webclientpokeapi.entities.sprites.Sprites;
import com.fabiopokeapi.webclientpokeapi.entities.subentities.AbilitiesOfAbility;
import com.fabiopokeapi.webclientpokeapi.entities.subentities.TypesOfType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class PokemonOneForOne {

    @Id
    private Integer id;
    private Integer height;
    private Integer weight;
    private String name;
    private String baseExperience;
    private List<TypesOfType>types;
    private List<AbilitiesOfAbility> abilities;
    private Sprites sprites;

    @JsonProperty("base_experience")
    public String getBaseExperience() {
        return baseExperience;
    }

}
