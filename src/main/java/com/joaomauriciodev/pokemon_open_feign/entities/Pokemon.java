package com.joaomauriciodev.pokemon_open_feign.entities;

public class Pokemon {
    public String id;
    public String name;

    public Pokemon() {
    }

    public Pokemon(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
