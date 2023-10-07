package br.gov.fazenda.receita.leilao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fazenda.receita.leilao.entity.Leilao;
import br.gov.fazenda.receita.leilao.repository.LeilaoRepository;

@Service
public class LeilaoServiceImpl implements LeilaoService{

    @Autowired
    private LeilaoRepository leilaoRepo;

    @Override
    public Leilao buscarLeilaoPorId(Long id) {
        Optional<Leilao> leilaoOp = leilaoRepo.findById(id);
        if(leilaoOp.isEmpty()){
            throw new IllegalArgumentException("Leilão não encontrado!");
        }
        return leilaoOp.get();
    }
    
}
