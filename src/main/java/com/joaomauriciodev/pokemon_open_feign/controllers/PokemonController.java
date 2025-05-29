package com.joaomauriciodev.pokemon_open_feign.controllers;

import com.joaomauriciodev.pokemon_open_feign.client.PokemonClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PokemonController {

    final PokemonClient pokemonClient;

    public PokemonController(PokemonClient pokemonClient) {
        this.pokemonClient = pokemonClient;
    }

    @GetMapping("/pokemons")
    public ResponseEntity<String> getAllPokemons() {
        return ResponseEntity.ok(pokemonClient.getAllPokemons());
    }
}
