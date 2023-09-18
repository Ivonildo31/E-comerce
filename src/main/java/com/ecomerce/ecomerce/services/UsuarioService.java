package com.ecomerce.ecomerce.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ecomerce.ecomerce.models.Usuario;

@Service
public interface UsuarioService {

    public Usuario salvar(Usuario usuario);

    public List<Usuario> listarUsuario();

    public Usuario buscarUsuarioPorId(UUID email);
    
}
