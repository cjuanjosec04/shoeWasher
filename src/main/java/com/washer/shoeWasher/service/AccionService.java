package com.washer.shoeWasher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washer.shoeWasher.model.Accion;
import com.washer.shoeWasher.repository.AccionRepository;

@Service
public class AccionService {
	@Autowired
	private AccionRepository Accion_Rep;
	
	public Accion save(Accion accion) {
		return Accion_Rep.save(accion);
	}
	public Accion update(Accion accion) {
		return Accion_Rep.save(accion);
	}
	public void delete(long id) {
		Accion_Rep.deleteById(id);
	}
	public List<Accion> listar(){
		return Accion_Rep.findAll();
	}
	
	public Optional<Accion> listarId(long id) {
        return Accion_Rep.findById(id);
    }
}
