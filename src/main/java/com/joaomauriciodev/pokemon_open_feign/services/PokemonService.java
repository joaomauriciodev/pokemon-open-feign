package com.joaomauriciodev.pokemon_open_feign.services;

import com.joaomauriciodev.pokemon_open_feign.client.PokemonClient;
import com.joaomauriciodev.pokemon_open_feign.client.PokemonListResponse;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    final public PokemonClient pokemonClient;

    public PokemonService(PokemonClient pokemonClient) {
        this.pokemonClient = pokemonClient;
    }

    public PokemonListResponse getPokemonList(int offset, int limit){
        if (offset < 0) offset = 0;
        if (limit < 1 || limit > 100) limit = 20;

        return pokemonClient.getAllPokemons(offset, limit);
    }

}
