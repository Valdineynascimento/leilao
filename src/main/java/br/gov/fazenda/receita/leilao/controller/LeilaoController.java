package br.gov.fazenda.receita.leilao.controller;

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

import br.gov.fazenda.receita.leilao.entity.Leilao;
import br.gov.fazenda.receita.leilao.service.LeilaoService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/leilao")
@CrossOrigin
public class LeilaoController {

    @Autowired
    private LeilaoService service;

    @GetMapping(value = "/{id}")
    @Operation(summary = "BUSCAR LEILAO", description = "BUSCAR LEILAO POR ID", tags = {"/leilao" })
    public Leilao buscarLeilaoPorId(@PathVariable("id") Long id){
        return service.buscarLeilaoPorId(id);
    }
    	
    @PostMapping
    @Operation(summary = "INSERIR LEILAO", description = "INSERIR NOVO LEILAO", tags = {"/leilao" })
    public Leilao novoLote(@RequestBody Leilao leilao) {
        return service.novoLeilao(leilao);
    }
        
	@PutMapping(value="/{id}")
	@Operation(summary = "ATUALIZAR LEILAO", description = "ATUALIZAR LEILAO PELO ID", tags = {"/leilao" })
	public ResponseEntity<Void> atualizarLeilao(@RequestBody Leilao leilao,@PathVariable Long id){
		leilao.setId(id);
		leilao = service.atualizarLeilao(leilao);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(value="/{id}")
	@Operation(summary = "EXCLUIR LEILAO", description = "EXCLUIREXCLUIR LEILAO PELO ID", tags = {"/leilao" })
	public ResponseEntity<Void> excluirLeilao(@PathVariable Long id)  {
		service.excluirLeilao(id);
		return ResponseEntity.noContent().build();
	}   

    
}