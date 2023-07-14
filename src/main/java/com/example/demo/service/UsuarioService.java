package com.example.demo.service;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public List<UsuarioDto> findAll() {
        return repository.buscarTodos();
    }

    public Page<Usuario> findAllPaginacao(int pagina, int itens) {
        return repository.findAll(PageRequest.of(pagina, itens));
    }
}