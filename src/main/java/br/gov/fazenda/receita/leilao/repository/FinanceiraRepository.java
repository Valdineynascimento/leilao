package br.gov.fazenda.receita.leilao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.fazenda.receita.leilao.entity.Financeira;

public interface FinanceiraRepository extends JpaRepository<Financeira, Long>{
    
}
