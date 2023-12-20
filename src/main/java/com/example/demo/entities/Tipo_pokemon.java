package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity

public class Tipo_pokemon {

    @Id
    @SequenceGenerator(name="tipo_pokemon_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tipo_pokemon_id_seq")
	private Integer id;

    private String descripcion;

    private String uuid;
    
}
