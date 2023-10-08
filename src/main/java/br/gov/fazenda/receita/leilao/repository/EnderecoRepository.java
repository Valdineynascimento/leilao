package br.gov.fazenda.receita.leilao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.fazenda.receita.leilao.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
}
