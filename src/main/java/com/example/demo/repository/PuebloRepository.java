package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.example.demo.entities.Pueblo;

public interface PuebloRepository extends JpaRepository<Pueblo, Integer> {
    
}
