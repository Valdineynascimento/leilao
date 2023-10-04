package br.gov.fazenda.receita.leilao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.gov.fazenda.receita.leilao.entity.Endereco;
import br.gov.fazenda.receita.leilao.repository.EnderecoRepository;

public class EnderecoServiceImpl implements EnderecoService{

    @Autowired
    private EnderecoRepository enderecoRepo;
    
    @Override
    public Endereco buscarEnderecoPorId(Long id) {
        Optional<Endereco> enderecoOp = enderecoRepo.findById(id);
        if(enderecoOp.isEmpty()){
            throw new IllegalArgumentException("Endereço não encontrado!");
        }
        return enderecoOp.get();
    }
    
}
