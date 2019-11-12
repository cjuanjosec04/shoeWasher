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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.washer.shoeWasher.model.Usuario;
import com.washer.shoeWasher.service.UsuarioService;



@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService User_Serv;
	
	@PostMapping(path="/insertar")
	public Usuario insertarP(@RequestBody Usuario us) {
		return User_Serv.save(us); 
	}
	
	@PutMapping(path="/update/{id}")
	public Usuario updateP(@RequestBody Usuario us,@PathVariable("id") long id) {
		us.setId_Usuario(id);
		return User_Serv.update(us); 
	}
	
	@DeleteMapping(path="/delete/{Id}")
	public void deleteP(@PathVariable long id) {
		User_Serv.delete(id); 
	}
	
	@GetMapping(path="/all")
	public List<Usuario> listarallP() {
		return User_Serv.listar(); 
	}
	
	@GetMapping(path = {"/{id}"})
    public Optional<Usuario> listarIdP(@PathVariable("id")long id){
        return User_Serv.listarId(id);
    }
	
	@PostMapping(path = {"/login"})
    public List<Usuario> login(@RequestParam(name = "email") String email, @RequestParam(name = "password") String contrasena){
        return User_Serv.LoginService(email, contrasena);
    }
}
