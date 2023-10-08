package br.gov.fazenda.receita.leilao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fazenda.receita.leilao.entity.Lote;
import br.gov.fazenda.receita.leilao.entity.Lote;
import br.gov.fazenda.receita.leilao.service.LoteService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin
@RequestMapping(value = "/lote")
public class LoteController {
	
	@Autowired
	private LoteService service;
	
    @GetMapping
    @Operation(summary = "BUSCAR LOTES", description = "BUSCAR TODOS LOTES", tags = {"/lote" })
    public List<Lote> buscarTodos() {
        return service.buscarTodos();
    }	
	
	@GetMapping(value="/{id}")
	@Operation(summary = "BUSCAR LOTE", description = "BUSCAR LOTE POR ID", tags = {"/lote" })
	public ResponseEntity<?> buscarPorId(@PathVariable Integer id)  {
		Lote obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
    @PostMapping
    @Operation(summary = "INSERIR LOTE", description = "INSERIR NOVO LOTE", tags = {"/lote" })
    public Lote novoLote(@RequestBody Lote lote) {
        return service.novoLote(lote);
    }
    
	@PutMapping(value="/{id}")
	@Operation(summary = "ATUALIZAR LOTE", description = "ATUALIZAR LOTE PELO ID", tags = {"/lote" })
	public ResponseEntity<Void> atualizarLote(@RequestBody Lote lote,@PathVariable Long id){
		lote.setId(id);
		lote = service.atualizarLote(lote);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(value="/{id}")
	@Operation(summary = "EXCLUIR LOTE", description = "EXCLUIREXCLUIR LOTE PELO ID", tags = {"/lote" })
	public ResponseEntity<Void> excluirLote(@PathVariable Long id)  {
		service.excluirLote(id);
		return ResponseEntity.noContent().build();
	}   

}
