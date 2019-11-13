package com.washer.shoeWasher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washer.shoeWasher.model.Accion_tipo_usuario;
import com.washer.shoeWasher.repository.Accion_tipo_usuario_repository;

@Service
public class Accion_tipo_usuario_service {
	@Autowired
	private Accion_tipo_usuario_repository Accion_tipo_usuario_object;
	
	public Accion_tipo_usuario save(Accion_tipo_usuario accion) {
		return Accion_tipo_usuario_object.save(accion);
	}
	public Accion_tipo_usuario update(Accion_tipo_usuario accion) {
		return Accion_tipo_usuario_object.save(accion);
	}
	public void delete(long id) {
		Accion_tipo_usuario_object.deleteById(id);
	}
	public List<Accion_tipo_usuario> listar(){
		return Accion_tipo_usuario_object.findAll();
	}
	
	public Optional<Accion_tipo_usuario> listarId(long id) {
        return Accion_tipo_usuario_object.findById(id);
    }
}
