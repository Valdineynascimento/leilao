package br.gov.fazenda.receita.leilao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.fazenda.receita.leilao.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
