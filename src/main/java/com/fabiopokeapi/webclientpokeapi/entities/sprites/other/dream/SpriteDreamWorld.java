package com.fabiopokeapi.webclientpokeapi.entities.sprites.other.dream;

import com.fabiopokeapi.webclientpokeapi.entities.sprites.other.dream.front.FrontDefault;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpriteDreamWorld {
    private FrontDefault frontDefault;

    @JsonProperty("dream_world")
    public FrontDefault getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(FrontDefault frontDefault) {
        this.frontDefault = frontDefault;
    }
}

