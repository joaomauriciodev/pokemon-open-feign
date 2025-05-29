package com.joaomauriciodev.pokemon_open_feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "pokemon",
        url = "https://pokeapi.co/api/v2"
)
public interface PokemonClient {

        @GetMapping("/pokemon")
        PokemonListResponse getAllPokemons(@RequestParam("offset") int offset,
                                           @RequestParam("limit") int limit);
}
