package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.example.demo.entities.Entrenador;

public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer> {

    Entrenador findByEmail(String email);
    
}
