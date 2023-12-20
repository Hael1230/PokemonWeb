package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.*;
import com.example.demo.repository.*;

@RestController 
@RequestMapping("/pokemons")

public class PokemonController {
    
    @Autowired
	PokemonRepository pokemonRepository;

    @GetMapping
	public List<Pokemon>listar(){
		return pokemonRepository.findAll();
	}

    @GetMapping("/{tipo}")
	public Optional<Pokemon>findContieneById(@PathVariable Tipo_pokemon tipo_pokemon ){
		Optional<Pokemon> pokemon=pokemonRepository.findByTipo_pokemon(tipo_pokemon);
		if(pokemon.isPresent()) {
			return pokemon;
		}
		return null;
	}

    @PostMapping
	public Pokemon postPokemon(@RequestBody Pokemon pokemon) {
		pokemonRepository.save(pokemon);
		return pokemon;
	}
}
