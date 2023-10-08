package br.gov.fazenda.receita.leilao.service;

import java.util.List;

import br.gov.fazenda.receita.leilao.entity.Item;
import br.gov.fazenda.receita.leilao.entity.Lote;

public interface LoteService {

	public Lote buscarPorId(Integer id);
	
	public List<Lote> buscarTodos();
	
	public Lote novoLote(Lote lote);
	
	public Lote novoLote(Double lance, Double valorInicial);
	
	public Item atualizarItem(Item item);
	
	public void excluirItem(Long id);	
}
