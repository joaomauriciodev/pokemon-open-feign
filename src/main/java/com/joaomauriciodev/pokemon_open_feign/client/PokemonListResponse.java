package com.joaomauriciodev.pokemon_open_feign.client;

import com.joaomauriciodev.pokemon_open_feign.entities.Pokemon;

import java.util.List;

public class PokemonListResponse {
    private int count;
    private String next;
    private String previous;
    private List<Pokemon> results;

    public PokemonListResponse() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }
}
