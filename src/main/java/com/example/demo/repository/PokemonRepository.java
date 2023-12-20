package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.example.demo.entities.Pokemon;
import com.example.demo.entities.Tipo_pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    Optional<Pokemon> findByTipo_pokemon(Tipo_pokemon tipo_pokemon);
    
}
