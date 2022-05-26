package com.fabiopokeapi.webclientpokeapi.service;

import com.fabiopokeapi.webclientpokeapi.entities.PokemonOneForOne;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PokemonService {

    public List<PokemonOneForOne> getAll();
    public PokemonOneForOne getCode(Integer id);
    public PokemonOneForOne create(PokemonOneForOne pokemonOneForOne);
    public void deleteById(Integer id);

}
