package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

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

public class Entrenador {

    @Id
    @SequenceGenerator(name="entrenador_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "entrenador_id_seq")
	private Integer id;
    
    private String nombre;

    private String apellido;

    private String email;

    private Date fecha_nacimiento;

    private Date fecha_vinculacion;

    @OneToMany
    @JoinColumn(name="pueblo_id")
	private Pueblo pueblo;

    private String uuid;

    public List<Pokemon> getPokemons() {
        return null;
    }

    
}
