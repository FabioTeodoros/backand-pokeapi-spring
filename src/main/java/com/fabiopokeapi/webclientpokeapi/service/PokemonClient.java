package com.fabiopokeapi.webclientpokeapi.service;

import com.fabiopokeapi.webclientpokeapi.entities.ListOfPokemon;
import com.fabiopokeapi.webclientpokeapi.entities.PokemonOneForOne;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j //para log Lombok
public class PokemonClient{


    private final WebClient webClient;


    //private CacheServiceWrapper cacheServiceWrapper;

    public PokemonClient(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://pokeapi.co/api/").build();
    }

    public Flux<ListOfPokemon> listAllPokemons(){
        log.info("Buscando todos os Pokemons ");
        return webClient
                .get()
                .uri("v2/pokemon?limit=1126&offset=0")
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError,
                        error -> Mono.error(new RuntimeException("verifique os parametrôs informados")))
                .bodyToFlux(ListOfPokemon.class);
    }

    public Mono<PokemonOneForOne> findALocationById(String id) {
        log.info("Buscando Pokemon com o id [{}]", id);
        return   webClient
                .get()
                .uri("v2/pokemon/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError,
                        error -> Mono.error(new RuntimeException("verifique os parâmetros informados")))
                .bodyToMono(PokemonOneForOne.class);


    }
}
