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
@Table(name = "itm_item")
@Data
public class Item implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itm_id")
	private Long id;

	@Column(name = "itm_nome")
	private String nome;

	@Column(name = "itm_descricao")
	private String descricao;

}
