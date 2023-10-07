package br.gov.fazenda.receita.leilao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.fazenda.receita.leilao.entity.Lote;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Long>{

	public Optional<Lote> findById(Integer id);

}
