package br.gov.fazenda.receita.leilao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fazenda.receita.leilao.entity.Usuario;
import br.gov.fazenda.receita.leilao.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Override
    public Usuario buscarUsuarioPorId(Long cpf) {
        Optional<Usuario> usuarioOp = usuarioRepo.findById(cpf);
        if(usuarioOp.isEmpty()){
            throw new IllegalArgumentException("Usuario não encontrado!");
        }
        return usuarioOp.get();
    }

    @Override
    public Usuario novoUsuario(Usuario usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'novoUsuario'");
    }
    
}
