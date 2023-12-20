package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.*;
import com.example.demo.repository.*;

@RestController 
@RequestMapping("/entrenador")
public class EntrenadorController {

    @Autowired
	EntrenadorRepository entrenadorRepository;

    @GetMapping
	public List<Entrenador>listar(){
		return entrenadorRepository.findAll();
	}

    @PostMapping("login")
    public ResponseEntity<String> getUuidByEmail(@RequestBody String email) {
        // Buscar el Entrenador por el correo electrónico
        Entrenador entrenador = entrenadorRepository.findByEmail(email);

        if (entrenador != null) {
            // Si se encuentra el Entrenador, devuelve su UUID
            String uuid = entrenador.getUuid();
            return  ResponseEntity.ok(uuid);
        } else {
            // Si no se encuentra, puedes devolver un código de estado 404 (Not Found)
            return ((HeadersBuilder<BodyBuilder>) ResponseEntity.status(HttpStatus.NOT_FOUND)).build();
        }
    }
    
	@GetMapping("/{uuid}/pokemons")
	public List<Pokemon> entrenadorPokemon(@PathVariable Integer uuid){
		Optional<Entrenador>entrenador=entrenadorRepository.findByUuid(uuid);
		if(entrenador.isPresent()) {
			return entrenador.get().getPokemons();
		}
		return null;
	}
    
}
