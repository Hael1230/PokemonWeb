package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity

public class Captura {

    @OneToMany
    @JoinColumn(name="pokemon_id")
	private Pokemon pokemon;

    @OneToMany
    @JoinColumn(name="entrenador_id")
	private Entrenador entrenador;
    
}
