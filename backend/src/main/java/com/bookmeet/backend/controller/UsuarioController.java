package com.bookmeet.backend.controller;

import com.bookmeet.backend.model.Usuario;
import com.bookmeet.backend.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Recibe peticiones HTTP y responde al cliente
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
