package br.gov.fazenda.receita.leilao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    @Override
    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null ||
                usuario.getNome() == null ||
                usuario.getNome().isBlank() || 
                usuario.getEmail() == null ||
                usuario.getEmail().isBlank() ||
                usuario.getTelefone() == null ||
                usuario.getTelefone().isBlank()) {
            throw new IllegalArgumentException("Usuário com atributos inválidos!");
        }

        usuario = usuarioRepo.save(usuario);

        return usuario;
    }

    /*@Transactional
    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null ||
                usuario.getNome() == null ||
                usuario.getNome().isBlank() || 
                usuario.getSenha() == null ||
                usuario.getSenha().isBlank()) {
            throw new IllegalArgumentException("Usuário com atributos inválidos!");
        }
        if(!usuario.getAutorizacoes().isEmpty()) {
            Set<Autorizacao> autorizacoes = new HashSet<Autorizacao>();
            for(Autorizacao autorizacao: usuario.getAutorizacoes()) {
                Autorizacao autorizacaoBd = buscarAutorizacaoPorId(autorizacao.getId());
                autorizacoes.add(autorizacaoBd);
            }
            usuario.setAutorizacoes(autorizacoes);
        }
        Set<Anotacao> anotacoes = usuario.getAnotacoes();
        usuario.setAnotacoes(new HashSet<Anotacao>());
        usuario = usuarioRepo.save(usuario);
        for(Anotacao anotacao: anotacoes) {
            anotacao.setUsuario(usuario);
            anotacao = anotacaoRepo.save(anotacao);
            usuario.getAnotacoes().add(anotacao);
        }
        
        return usuario;
    }*/
    
}
