package br.gov.fazenda.receita.leilao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.fazenda.receita.leilao.entity.Leilao;

public interface LeilaoRepository extends JpaRepository<Leilao, Long>{
    
}
