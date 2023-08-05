package com.example.demo.repository;

import com.example.demo.entity.Usuario;
import com.example.demo.projections.UsuarioProjections;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query("select usuario.nome from Usuario usuario")
    List<Usuario> buscarNomesUsuarios();

    @Query("select usuario.nome as nome, usuario.login as login from Usuario usuario")
    List<UsuarioProjections> buscarNomesUsuariosProjections();

    // buscando por nome ignorando maisculas e minusculas
    List<Usuario> findByNomeIgnoreCase(String nome);

    // limitando registro em duas consultas
    List<Usuario> findTop2By();

    // buscando por nome que contenha um determinado trecho
    List<Usuario> findByNomeContains(String nome);

    // buscando por nome que contenha um determinado trecho
    List<Usuario> findByNomeContainsIgnoreCase(String nome);
}