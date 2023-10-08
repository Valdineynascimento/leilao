package br.gov.fazenda.receita.leilao.service;

import br.gov.fazenda.receita.leilao.entity.Financeira;

public interface FinanceiraService {

    public Financeira buscarFinanceiraPorCnpj(Long cnpj);
    
}
