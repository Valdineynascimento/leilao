package br.gov.fazenda.receita.leilao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fazenda.receita.leilao.entity.Financeira;
import br.gov.fazenda.receita.leilao.repository.FinanceiraRepository;

@Service
public class FinanceiraServiceImpl implements FinanceiraService{

    @Autowired
    private FinanceiraRepository financeiraRepo;
    
    @Override
    public Financeira buscarFinanceiraPorCnpj(Long cnpj) {
        Optional<Financeira> financeiraOp = financeiraRepo.findById(cnpj);
        if(financeiraOp.isEmpty()){
            throw new IllegalArgumentException("Financeira não encontrada!");
        }
        return financeiraOp.get();
    }
    
}
