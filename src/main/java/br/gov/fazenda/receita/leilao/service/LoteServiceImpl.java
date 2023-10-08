package br.gov.fazenda.receita.leilao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fazenda.receita.leilao.entity.Lote;
import br.gov.fazenda.receita.leilao.repository.LoteRepository;

@Service
public class LoteServiceImpl implements LoteService{
	
	@Autowired
	private LoteRepository repo;
	
	public Lote buscarPorId(Integer id) {
	    Optional<Lote> loteOp = repo.findById(id);
	    if(loteOp.isEmpty()){
            	throw new IllegalArgumentException("Lote não encontrado!");
            }
	    return loteOp.get();
	}
		
	public List<Lote> buscarTodos () {
	    return repo.findAll();
	}
		
	@Override
	public Lote novoLote (Lote lote) {
	    if (lote == null || 
	    	lote.getLance() == null || 
	    	lote.getValorInicial() == null ||
	        lote.getLance() <= 0 || 
	        lote.getValorInicial() <= 0) {
	        throw new IllegalArgumentException("Parâmetros inválidos!");
	    }
	    return repo.save(lote);
	}

	@Override
	public Lote novoLote (Double lance, Double valorInicial) {
	    if (lance == null || 
	    	valorInicial == null || 
	    	lance <= 0 || 
	    	valorInicial <= 0) {
	        throw new IllegalArgumentException("Parâmetros inválidos!");
	    }
	    Lote lote = new Lote();
	    lote.setLance(lance);
	    lote.setValorInicial(valorInicial);
	    return novoLote(lote);
	}
	
	public Lote atualizarLote (Lote lote) {
    	return repo.save(lote);
    	}
    
    	public void excluirLote (Long id) {
	    repo.deleteById(id);
	}

}
