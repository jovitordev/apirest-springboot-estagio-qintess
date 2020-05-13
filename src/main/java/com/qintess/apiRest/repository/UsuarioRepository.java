package com.qintess.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.apiRest.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
