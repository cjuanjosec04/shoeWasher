package com.washer.shoeWasher.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.washer.shoeWasher.model.Accion_tipo_usuario;
import com.washer.shoeWasher.service.Accion_tipo_usuario_service;



@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/accion_tipo_usuario_controller")
public class Accion_tipo_usuario_controller {
	@Autowired
	private Accion_tipo_usuario_service Accion_tipo_usuario_Serv;
	
	@PostMapping(path="/insertar")
	public Accion_tipo_usuario insertarP(@RequestBody Accion_tipo_usuario us) {
		return Accion_tipo_usuario_Serv.save(us); 
	}
	
	@PutMapping(path="/update/{id}")
	public Accion_tipo_usuario updateP(@RequestBody Accion_tipo_usuario us,@PathVariable("id") long id) {
		us.setId_accion_tipo_usuario(id);
		return Accion_tipo_usuario_Serv.update(us); 
	}
	
	@DeleteMapping(path="/delete/{Id}")
	public void deleteP(@PathVariable long id) {
		Accion_tipo_usuario_Serv.delete(id); 
	}
	
	@GetMapping(path="/all")
	public List<Accion_tipo_usuario> listarallP() {
		return Accion_tipo_usuario_Serv.listar(); 
	}
	
	@GetMapping(path = {"/{id}"})
    public Optional<Accion_tipo_usuario> listarIdP(@PathVariable("id")long id){
        return Accion_tipo_usuario_Serv.listarId(id);
    }
}
