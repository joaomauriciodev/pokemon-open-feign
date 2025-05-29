package com.joaomauriciodev.pokemon_open_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class PokemonOpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonOpenFeignApplication.class, args);
	}

}
