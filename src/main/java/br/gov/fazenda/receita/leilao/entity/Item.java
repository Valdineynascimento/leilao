package br.gov.fazenda.receita.leilao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


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
@Table(name = "itm_item")
@Data
public class Item implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itm_id")
	protected Long id;

	@Column(name = "itm_tipo")
	protected String tipo;

	@Column(name = "itm_nome")
	protected String nome;

	@Column(name = "itm_descricao")
	protected String descricao;

	@Column(name = "itm_maior_lance")
	protected Double maiorLance;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "itm_lot_id")
	protected Lote lote;

	@OneToMany(mappedBy = "item")
	protected List<Lance> lances;

	public Item(String tipo, String nome, String descricao, Lote lote) {
		this.tipo = tipo;
		this.nome = nome;
		this.descricao = descricao;
		this.lote = lote;
		this.maiorLance = null;
		this.lances = new ArrayList<Lance>();
	}

}
