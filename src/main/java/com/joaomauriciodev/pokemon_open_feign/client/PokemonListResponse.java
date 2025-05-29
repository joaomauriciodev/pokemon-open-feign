package com.joaomauriciodev.pokemon_open_feign.client;

import com.joaomauriciodev.pokemon_open_feign.entities.PokemonItem;

import java.util.List;

public class PokemonListResponse {
    private int count;
    private String next;
    private String previous;
    private List<PokemonItem> results;

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

    public List<PokemonItem> getResults() {
        return results;
    }

    public void setResults(List<PokemonItem> results) {
        this.results = results;
    }
}
