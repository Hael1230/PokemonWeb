package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.example.demo.entities.Entrenador;
import java.util.List;
import java.util.Optional;


public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer> {

    Entrenador findByEmail(String email);

    Optional<Entrenador> findByUuid(Integer uuid);
    
}
