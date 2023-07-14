package com.example.demo.repository;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Page<Usuario> findAll(Pageable pageable);

    @Query("select new com.example.demo.dto.UsuarioDto(usuario.nome, usuario.login) from Usuario usuario")
    List<UsuarioDto> buscarTodos();
}