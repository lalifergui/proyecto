package com.bookmeet.backend.repository;

import com.bookmeet.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//acceso a la base de datos
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
