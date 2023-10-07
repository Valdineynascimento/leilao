package br.gov.fazenda.receita.leilao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fazenda.receita.leilao.entity.Item;
import br.gov.fazenda.receita.leilao.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository repo;
	
	public Item buscarPorId(Long id) {
		Optional<Item> itemOp = repo.findById(id);
		return itemOp.get();
	}
	
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
	
    @Override
    public Item novoItem(String nome, String descricao) {
        Item item = new Item();
        item.setNome(nome);
        item.setDescricao(descricao);
        return novoItem(item);
    }

}
