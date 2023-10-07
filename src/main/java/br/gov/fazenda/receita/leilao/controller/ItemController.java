package br.gov.fazenda.receita.leilao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fazenda.receita.leilao.entity.Item;
import br.gov.fazenda.receita.leilao.service.ItemService;

@RestController
@CrossOrigin
@RequestMapping(value = "/item")

public class ItemController {
	
	@Autowired
	private ItemService service;
		
    @GetMapping
    public List<Item> buscarTodos() {
        return service.buscarTodos();
    }
		
	@GetMapping(value="/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Long id)  {
		Item obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}	
	
    @PostMapping
    public Item novoItem(@RequestBody Item item) {
        return service.novoItem(item);
    }
}
