package com.fabiopokeapi.webclientpokeapi.entities.sprites.other.dream.front;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FrontDefault {
    private String frontDefault;

    @JsonProperty("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }
}
