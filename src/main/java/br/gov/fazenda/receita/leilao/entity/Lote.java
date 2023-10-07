package br.gov.fazenda.receita.leilao.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@Column(name = "lot_lace")
	private Double lance;
	
	@Column(name = "lot_valorInicial")
	private Double valorInicial;
	
}