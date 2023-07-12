package com.example.demo.controller;

import com.example.demo.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("/pessoa")
@RestController
public class PessoaController {

    PessoaService service;

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/paginacao")
    public ResponseEntity findAllPaginacao(@RequestParam("pagina") int pagina,
                                           @RequestParam("itens") int itens) {
        return ResponseEntity.ok(service.findAllPaginacao(pagina, itens));
    }
}