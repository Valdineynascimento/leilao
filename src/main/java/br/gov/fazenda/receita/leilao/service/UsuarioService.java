package br.gov.fazenda.receita.leilao.service;

import java.util.List;

import br.gov.fazenda.receita.leilao.entity.Usuario;

public interface UsuarioService {

    public Usuario buscarUsuarioPorId(Long cpf);

    public Usuario novoUsuario(Usuario usuario);

    public String excluirUsuarioPorId(Long cpf);

    public List<Usuario> buscarTodosUsuarios();
        
}
