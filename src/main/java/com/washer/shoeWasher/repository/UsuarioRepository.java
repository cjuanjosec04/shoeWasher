package com.washer.shoeWasher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.washer.shoeWasher.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query("select u from Usuario u where u.Email = ?1 and u.Contrasena = ?2")
	List <Usuario> findByEmailAndPassword(String Email, String Contrasena);

}
