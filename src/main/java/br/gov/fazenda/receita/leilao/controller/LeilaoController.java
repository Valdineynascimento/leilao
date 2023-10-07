package br.gov.fazenda.receita.leilao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fazenda.receita.leilao.entity.Leilao;
import br.gov.fazenda.receita.leilao.service.LeilaoService;

@RestController
@RequestMapping(value = "/leilao")
@CrossOrigin
public class LeilaoController {

    @Autowired
    private LeilaoService service;

    @GetMapping(value = "/{id}")
    public Leilao buscarLeilaoPorId(@PathVariable("id") Long id){
        return service.buscarLeilaoPorId(id);
    }
    
}
