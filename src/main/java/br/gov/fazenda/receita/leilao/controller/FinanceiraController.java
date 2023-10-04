package br.gov.fazenda.receita.leilao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fazenda.receita.leilao.entity.Financeira;
import br.gov.fazenda.receita.leilao.service.FinanceiraService;

@RestController
@RequestMapping(value = "/financeira")
@CrossOrigin
public class FinanceiraController {

    @Autowired
    private FinanceiraService service;

    @GetMapping(value = "/{id}")
    public Financeira buscarFinanceiraPorCnpj(@PathVariable("cnpj") Long cnpj){

        return service.buscarFinanceiraPorCnpj(cnpj);

    }
    
}
