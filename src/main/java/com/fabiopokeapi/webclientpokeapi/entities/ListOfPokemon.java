package com.fabiopokeapi.webclientpokeapi.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) //mapear campo json
public class ListOfPokemon{

   List <Pokemon> results;

}
