package br.gov.fazenda.receita.leilao.service;

import br.gov.fazenda.receita.leilao.entity.Usuario;

public interface UsuarioService {

    public Usuario buscarUsuarioPorId(Long id);

    public Usuario novoUsuario(Usuario usuario);
    
}
