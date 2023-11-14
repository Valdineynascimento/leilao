package br.gov.fazenda.receita.leilao.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lot_lote")
@Data
public class Lote implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lot_id")
	private Long id;
	
	@Column(name = "lot_lance")
	private Double lance;
	
	@Column(name = "lot_valor_inicial")
	private Double valorInicial;

	@OneToMany(mappedBy = "lote")
	private Set<Item> itens; 

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "lot_lei_id")
	private Leilao leilao;
	
}