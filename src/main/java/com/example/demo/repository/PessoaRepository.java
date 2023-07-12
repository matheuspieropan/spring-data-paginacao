package com.example.demo.repository;

import com.example.demo.entity.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    Page<Pessoa> findAll(Pageable pageable);
}