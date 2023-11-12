package br.gov.fazenda.receita.leilao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.fazenda.receita.leilao.entity.Item;
import br.gov.fazenda.receita.leilao.entity.Lote;
import br.gov.fazenda.receita.leilao.repository.ItemRepository;
import br.gov.fazenda.receita.leilao.repository.LoteRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository repo;

    @Autowired
	private LoteRepository loteRepo;
	
    @Override
	public Item buscarPorId(Long id) {
		Optional<Item> itemOp = repo.findById(id);
		return itemOp.get();
	}
	
    @Override
	public List<Item> buscarTodos() {
		return repo.findAll();
	}
	
    @Override
    public Item novoItem(Item item) {
        if(item.getNome() == null || 
                item.getNome().isEmpty() ||
                item.getDescricao() == null ||
                item.getDescricao().isEmpty()) {
            throw new IllegalArgumentException("Parâmetros inválidos!");
        }
        return repo.save(item);
    }	
	
    /*@Override
    public Item novoItem(String tipo, String nome, String descricao) {
        Item item = new Item();
        item.setTipo(tipo);
        item.setNome(nome);
        item.setDescricao(descricao);
        return repo.save(item);	
    }*/
    
    @Override
    public Item atualizarItem(Item item) {
    	return repo.save(item);
    }
    
    @Override
    public void excluirItem(Long id) {
    	repo.deleteById(id);
    }

    @Override
    public Item novoItem(String tipo, String nome, String descricao, Long idLote) {
        Optional<Lote> loteOp = loteRepo.findById(idLote);
        if(loteOp.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lote inexistente!");
        }
        Item item = new Item();
        item.setTipo(tipo);
        item.setNome(nome);
        item.setDescricao(descricao);
        item.setLote(loteOp.get());
        return repo.save(item);
    } 

}
