package com.washer.shoeWasher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.washer.shoeWasher.model.Accion_tipo_usuario;

@Repository
public interface Accion_tipo_usuario_repository extends JpaRepository<Accion_tipo_usuario, Long>{

}
