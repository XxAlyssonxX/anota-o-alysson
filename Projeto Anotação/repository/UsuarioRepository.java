package com.projetonovo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetonovo.entities.Usuario;

public interface  UsuarioRepository extends JpaRepository<Usuario,Long>{

}