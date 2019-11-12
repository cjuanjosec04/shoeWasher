package com.washer.shoeWasher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washer.shoeWasher.model.Usuario;
import com.washer.shoeWasher.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository User_Rep;
	
	public Usuario save(Usuario us) {
		return User_Rep.save(us);
	}
	public Usuario update(Usuario us) {
		return User_Rep.save(us);
	}
	public void delete(long id) {
		User_Rep.deleteById(id);
	}
	public List<Usuario> listar(){
		return User_Rep.findAll();
	}
	
	public Optional<Usuario> listarId(long id) {
        return User_Rep.findById(id);
    }
	
	public List<Usuario> LoginService(String Email, String Contrasena) {
		return User_Rep.findByEmailAndPassword(Email, Contrasena);
    }
}
