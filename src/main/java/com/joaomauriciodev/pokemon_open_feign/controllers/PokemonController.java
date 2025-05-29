package com.joaomauriciodev.pokemon_open_feign.controllers;

import com.joaomauriciodev.pokemon_open_feign.client.PokemonClient;
import com.joaomauriciodev.pokemon_open_feign.client.PokemonListResponse;
import com.joaomauriciodev.pokemon_open_feign.services.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PokemonController {

    final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemons")
    public ResponseEntity<PokemonListResponse> getAllPokemons(
        @RequestParam(name = "offset", defaultValue = "0") int offset,
        @RequestParam(name = "limit", defaultValue = "20") int limit
    ) {
        try {
            PokemonListResponse response = pokemonService.getPokemonList(offset, limit);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
