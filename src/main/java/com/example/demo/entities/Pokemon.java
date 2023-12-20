package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity

public class Pokemon {

    @Id
    @SequenceGenerator(name="pokemon_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pokemon_id_seq")
	private Integer id;

    private String nombre;

    @OneToMany
    @JoinColumn(name="tipo_pokemon_id")
	private Tipo_pokemon tipo_pokemon;
    
    private Date fecha_descubrimiento;

    private Integer generacion;

    private String uuid;
}
