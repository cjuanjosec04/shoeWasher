package com.washer.shoeWasher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.washer.shoeWasher.model.Accion;

@Repository
public interface AccionRepository extends JpaRepository<Accion, Long>{

}
