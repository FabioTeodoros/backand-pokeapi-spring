package com.fabiopokeapi.webclientpokeapi.controller;

import com.fabiopokeapi.webclientpokeapi.service.PokemonClient;
import com.fabiopokeapi.webclientpokeapi.entities.ListOfPokemon;
import com.fabiopokeapi.webclientpokeapi.entities.PokemonOneForOne;
import com.fabiopokeapi.webclientpokeapi.service.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/servicos")
@AllArgsConstructor
public class PokemonController{

    @Autowired
    PokemonClient pokemonClient;

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/pokemon")
    @ResponseStatus(HttpStatus.OK)
    public Flux<ListOfPokemon> ListAllPokemons() {
        return pokemonClient.listAllPokemons();
    }

    @GetMapping("/pokemon/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<PokemonOneForOne> getAlocationById(@PathVariable String id) {
        return pokemonClient.findALocationById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PokemonOneForOne> getAll() {
        return pokemonService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PokemonOneForOne getByCode(@PathVariable Integer id) {
        return pokemonService.getCode(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public PokemonOneForOne create(@RequestBody PokemonOneForOne pokemonOneForOne){
        return pokemonService.create(pokemonOneForOne);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        this.pokemonService.deleteById(id);
    }


}