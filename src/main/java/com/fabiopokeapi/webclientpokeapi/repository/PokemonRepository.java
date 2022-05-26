package com.fabiopokeapi.webclientpokeapi.repository;

import com.fabiopokeapi.webclientpokeapi.entities.PokemonOneForOne;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokemonRepository extends MongoRepository<PokemonOneForOne, Integer> {
//   @DeleteQuery
//    void deleteById(Integer id);
}
