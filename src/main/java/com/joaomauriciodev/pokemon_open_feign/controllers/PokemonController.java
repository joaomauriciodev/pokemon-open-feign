package com.joaomauriciodev.pokemon_open_feign.controllers;

import com.joaomauriciodev.pokemon_open_feign.client.PokemonClient;
import com.joaomauriciodev.pokemon_open_feign.client.PokemonListResponse;
import com.joaomauriciodev.pokemon_open_feign.entities.Pokemon;
import com.joaomauriciodev.pokemon_open_feign.services.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/pokemons/{id}")
    public ResponseEntity<Pokemon> getPokemonById(
            @PathVariable String id
    ){
        return ResponseEntity.ok(pokemonService.getPokemonById(id));
    }
}
