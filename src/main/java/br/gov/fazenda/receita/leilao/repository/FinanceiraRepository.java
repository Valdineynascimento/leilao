package br.gov.fazenda.receita.leilao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.fazenda.receita.leilao.entity.Financeira;


public interface FinanceiraRepository extends JpaRepository<Financeira, Long>{

    public Optional<Financeira> findById(Long id);
    public void deleteById(Long id);
    
}
