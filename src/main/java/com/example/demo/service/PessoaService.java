package com.example.demo.service;

import com.example.demo.entity.Pessoa;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;

    public List<Pessoa> findAll() {
        return (List<Pessoa>) repository.findAll();
    }

    public List<Pessoa> findAllPaginacao(int pagina, int itens) {
        return repository.findAll(PageRequest.of(pagina, itens)).getContent();
    }
}