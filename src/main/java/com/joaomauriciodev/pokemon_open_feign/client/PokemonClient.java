package com.joaomauriciodev.pokemon_open_feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "pokemon",
        url = "https://pokeapi.co/api/v2/pokemon"
)
public interface PokemonClient {

        @GetMapping()
        String getAllPokemons();
}
