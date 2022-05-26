package com.fabiopokeapi.webclientpokeapi.service.impl;

import com.fabiopokeapi.webclientpokeapi.entities.PokemonOneForOne;
import com.fabiopokeapi.webclientpokeapi.repository.PokemonRepository;
import com.fabiopokeapi.webclientpokeapi.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    @Override
    public List<PokemonOneForOne> getAll(){
        return this.pokemonRepository.findAll();
    }

    @Override
    public PokemonOneForOne getCode(Integer id){
        return this.pokemonRepository
                .findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Pokemon não existe."));
    }

    @Override
    public PokemonOneForOne create(PokemonOneForOne pokemonOneForOne){
        return this.pokemonRepository.save(pokemonOneForOne);
    }

    @Override
    public void deleteById(Integer id) {
        this.pokemonRepository.deleteById(id);
    }

}
