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

import com.washer.shoeWasher.model.Accion;
import com.washer.shoeWasher.service.AccionService;



@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/accion")
public class AccionController {
	@Autowired
	private AccionService Accion_Serv;
	
	@PostMapping(path="/insertar")
	public Accion insertarP(@RequestBody Accion us) {
		return Accion_Serv.save(us); 
	}
	
	@PutMapping(path="/update/{id}")
	public Accion updateP(@RequestBody Accion us,@PathVariable("id") long id) {
		us.setId_Accion(id);
		return Accion_Serv.update(us); 
	}
	
	@DeleteMapping(path="/delete/{Id}")
	public void deleteP(@PathVariable long id) {
		Accion_Serv.delete(id); 
	}
	
	@GetMapping(path="/all")
	public List<Accion> listarallP() {
		return Accion_Serv.listar(); 
	}
	
	@GetMapping(path = {"/{id}"})
    public Optional<Accion> listarIdP(@PathVariable("id")long id){
        return Accion_Serv.listarId(id);
    }
}
