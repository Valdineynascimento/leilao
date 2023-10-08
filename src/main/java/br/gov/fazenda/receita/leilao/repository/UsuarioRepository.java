package br.gov.fazenda.receita.leilao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.fazenda.receita.leilao.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
