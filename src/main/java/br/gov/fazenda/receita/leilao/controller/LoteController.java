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
import br.gov.fazenda.receita.leilao.entity.Lote;
import br.gov.fazenda.receita.leilao.service.LoteService;

@RestController
@CrossOrigin
@RequestMapping(value = "/lote")
public class LoteController {
	
	@Autowired
	private LoteService service;
	
    @GetMapping
    public List<Lote> buscarTodos() {
        return service.buscarTodos();
    }	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Integer id)  {
		Lote obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
    @PostMapping
    public Lote novoLote(@RequestBody Lote lote) {
        return service.novoLote(lote);
    }

}
