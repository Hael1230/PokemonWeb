package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.example.demo.entities.Tipo_pokemon;

public interface Tipo_pokemonRepository extends JpaRepository<Tipo_pokemon, Integer>{
    
}
