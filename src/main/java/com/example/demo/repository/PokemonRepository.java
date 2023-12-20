package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.example.demo.entities.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    
}
