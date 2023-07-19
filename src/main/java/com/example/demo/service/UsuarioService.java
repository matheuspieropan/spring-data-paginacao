package com.example.demo.service;

import com.example.demo.entity.Usuario;
import com.example.demo.projections.UsuarioProjections;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public List<Usuario> findAll() {
        return repository.buscarNomesUsuarios();
    }

    public List<UsuarioProjections> buscarNomesUsuariosProjections() {
        return repository.buscarNomesUsuariosProjections();
    }
}