package com.fabiopokeapi.webclientpokeapi.entities.sprites;

import com.fabiopokeapi.webclientpokeapi.entities.sprites.other.dream.SpriteDreamWorld;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprites {

    private String spriteFrontDefault;
    private SpriteDreamWorld spriteDreamWorld;

    @JsonProperty("other")
    public SpriteDreamWorld getSpriteDreamWorld() {
        return spriteDreamWorld;
    }

    public void setSpriteDreamWorld(SpriteDreamWorld spriteDreamWorld) {
        this.spriteDreamWorld = spriteDreamWorld;
    }

    @JsonProperty("front_default")
    public String getSpriteFrontDefault() {
        return spriteFrontDefault;
    }

    public void setSpriteFrontDefault(String spriteFrontDefault) {
        this.spriteFrontDefault = spriteFrontDefault;
    }
}
